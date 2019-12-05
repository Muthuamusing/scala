# scala
Folding:
        Fold takes a binary operator as a parameter and return final result by merging collections. 
        
        Folding can be applied in both mutable and immutable collections. FoldLeft traverse the elements in the array from left to right. 
        
        foldLeft method allows you to specify initial value as well.
FoldLeft Syntax:
        def foldLeft[B](z: B)(op: (B, A) ⇒ B): B
        Applies a binary operator to a start value and all elements of this sequence, going left to right.


