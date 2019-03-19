package accessmodifiers;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?                 - package private
// 2. the int variable SOME_CONSTANT?           - all interface variables are public (static final)
// 3. methodA?                                  - public
// 4. methodB?                                  - public
// 5. methodC?                                  - public

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();      // declaration is redundant - All methods of an Interface are public abstract
    abstract void methodB();    // declaration is redundant - All methods of an Interface are public abstract
    boolean methodC();
}
