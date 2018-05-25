package linuxshell;

public class Albero {
private NodoAlbero ptr;

public Albero(String usr){
    ptr=new NodoAlbero(new FileFolder('d',"/","root","1024"));
    this.aggiungiFiglio("/",new FileFolder('d',"proc","root","1024"));
    this.aggiungiFiglio("/",(new FileFolder('d',"root","root","1024")));
    this.aggiungiFiglio("/",(new FileFolder('d',"var","root","1024")));
    this.aggiungiFiglio("/",(new FileFolder('d',"usr","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"tmp","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"srv","root","1024")));
    this.aggiungiFiglio("/",(new FileFolder('d',"sbin","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"opt","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"mnt","root","1024")));
    this.aggiungiFiglio("/",(new FileFolder('d',"media","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"lib","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"home","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"etc","root","1024")));
    this.aggiungiFiglio("/", (new FileFolder('d',"dev","root","1024")));
    this.aggiungiFiglio("/",(new FileFolder('d',"boot","root","1024")));
    this.aggiungiFiglio("/",(new FileFolder('d',"bin","root","1024")));
    this.aggiungiFiglio("home",(new FileFolder('d',usr,usr,"1024")));
    this.aggiungiFiglio(usr,(new FileFolder('d',"home",usr,"1024")));
    
    

    
    
    
}

public void visitaAnticipata() {
    visitaAnticipata(ptr);
}

private void visitaAnticipata(NodoAlbero p) {
 if (p == null)
   return;
 System.out.println(p.getInfo());
 if (p.getFirstChild() != null)
   visitaAnticipata(p.getFirstChild());
 if (p.getFirstSibling() != null)
   visitaAnticipata(p.getFirstSibling());
}

private NodoAlbero cercaNodo(NodoAlbero p,String chiave) {
 
   NodoAlbero p1=null; 
 if (p == null)
   return null;

 if (p.getInfo().getNome().equals(chiave)) return p;  //ricerca con successo
 if (p.getFirstChild() != null)      //ricerca verso il figlio
   p1=cercaNodo(p.getFirstChild(),chiave);
   if (p1!=null) return p1; //interruzione della ricorsione  
 if (p.getFirstSibling() != null) //ricerca verso il fratello
 p1=cercaNodo(p.getFirstSibling(),chiave);
   if (p1!=null) return p1; //interruzione della ricorsione  
 return null;
}

public void aggiungiFratello(String chiave, FileFolder info) {
 NodoAlbero n=new NodoAlbero(info) ;
 if (ptr==null){ //albero vuoto inserimento radice
  ptr=n;
  return;
 } 
 NodoAlbero p;
 p=cercaNodo(ptr,chiave);
 if (p!=null) {
    while(p.getFirstSibling()!=null)
        p=p.getFirstSibling();
    p.setFirstSibling(n);
 }
 
 else System.out.println ("nodo  "+chiave+" non trovato!" );
 
}
public void aggiungiFiglio(String chiave, FileFolder info) {
 NodoAlbero n=new NodoAlbero(info) ;
 if (ptr==null){ //albero vuoto inserimento radice
  ptr=n;
  return;
 } 
 NodoAlbero p;
 p=cercaNodo(ptr,chiave);
 
     
 if (p!=null) {
    if(p.getFirstChild()== null)
        p.setFirstChild(n);
    else{
        NodoAlbero tmp= p.getFirstChild();
        p.setFirstChild(n);
        n.setFirstSibling(tmp);
    }
 }
 else System.out.println ("nodo  "+chiave+" non trovato!" );
}

    public NodoAlbero getPtr() {
        return ptr;
    }

}