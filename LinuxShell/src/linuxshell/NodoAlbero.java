package linuxshell;

public class NodoAlbero {

 private FileFolder info;
 private NodoAlbero pfc;
 private NodoAlbero pfs;

 public NodoAlbero(FileFolder info) {
  this.info = info;
  pfc = null;
  pfs = null;
 }

 public void setInfo(FileFolder info) {
  this.info = info;
 }

 public FileFolder getInfo() {
  return info;
 }

 public void setFirstChild(NodoAlbero pfc) {
  this.pfc = pfc;
 }

 public NodoAlbero getFirstChild() {
  return pfc;
 }

 public void setFirstSibling(NodoAlbero pfs) {
  this.pfs = pfs;
 }

 public NodoAlbero getFirstSibling() {
  return pfs;
 }
}