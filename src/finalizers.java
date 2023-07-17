public class finalizers {
    
// java has automatic storage management and garbage collection facility,, this is performed by destruction memathod called finalize
// finalizars are automaitcally called wehn object is destroyed
void finalize(){
    System.out.println("Object has been garbage collected");
}
}
