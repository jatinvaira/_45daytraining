public class interfaces {
    
}



// it is a prototype for a class, interfaces are skeletons for classes. 
// showing what form that class will take when someone implements it. 
// they are declared using interface keyword
// and have no implementation of their own methods or attributes.
// it provides complete abstraction 
// as none of its meathod can have body
// because there's nothing to implement
// interface can't be declared private protected

// rules to make interface
// :
// cannot contain any method implementations (body) except default ones provided by the compiler if not specified explicitly in
// cannot contain any method with bodies (abstract) - only signatures
// variables declaredshould be public static final
// function declared shouldbe of abstract type
// not use object to call interface



// when a class implement and interface the class has to implement all meathod
// if you are implementing only a few of meathod, the class has to be declared an abstract class
// interface meathod are public abstract and never final
// think of them as an prototype only
// no implementation is allowed


interface A{

}
interface B{

}
void implementing A,B{
    
}