package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    static Stack stack;
    @BeforeEach
    void SetUp(){
        stack = new Stack();
    }
    @Test
    void PushShouldAddElementToTheTopOfStack(){
        stack.push(4);
        Assertions.assertEquals(4, stack.peek());
        Assertions.assertEquals(1, stack.size());
    }
    @Test
    void PushShouldExpandArrayIfStackIsfull(){
        for (int i = 0; i < 10; i++)
            stack.push(0);
        Assertions.assertEquals(10,stack.size());
        stack.push(23);
        Assertions.assertEquals(11,stack.size());
        Assertions.assertEquals(23, stack.peek());
    }
    @Test
    void PopShouldGiveTheFirstElementOfStack(){
        stack.push(18);
        Assertions.assertEquals(18, stack.pop());
        Assertions.assertEquals(0, stack.size());
    }

    @Test
    void PopShouldThrowsExeceptionOfStackEmpty(){
        Assertions.assertThrows(IllegalStateException.class,() -> stack.pop());
    }
    @Test
    void PeekShouldGiveTheFirstElementOfStack(){
        stack.push(18);
        Assertions.assertEquals(18, stack.peek());
        Assertions.assertEquals(1, stack.size());
    }

    @Test
    void PeekShouldThrowsExeceptionOfStackEmpty(){
        Assertions.assertThrows(IllegalStateException.class,() -> stack.peek());
    }
    @Test
    void SizeShouldUpdateStackSize(){
        Assertions.assertEquals(0, stack.size());
        stack.push(14);
        Assertions.assertEquals(1,stack.size());
    }
    @Test
    void StackBeDeclaredEmpty(){
        Assertions.assertTrue(stack.isEmpty());
        stack.push(15);
        Assertions.assertFalse(stack.isEmpty());
    }
}
