package codeit.gatcha.api.DTO.question.outputDTO;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static codeit.gatcha.api.DTO.question.outputDTO.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class Admin_QuestionsDTO_toString_5424629915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579;

    public Admin_QuestionsDTO_toString_5424629915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term584 = new Integer(-226514366);
        Object term582 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term582, term582.getClass(), "body", "");
        setField(term582, term582.getClass(), "id", term584);
        Integer term588 = new Integer(1193880199);
        Object term586 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term586, term586.getClass(), "body", "");
        setField(term586, term586.getClass(), "id", term588);
        Integer term592 = new Integer(-1087774327);
        Object term590 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term590, term590.getClass(), "body", "");
        setField(term590, term590.getClass(), "id", term592);
        Integer term596 = new Integer(-1530420153);
        Object term594 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term594, term594.getClass(), "body", "");
        setField(term594, term594.getClass(), "id", term596);
        Integer term600 = new Integer(-469968304);
        Object term598 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term598, term598.getClass(), "body", "");
        setField(term598, term598.getClass(), "id", term600);
        Integer term604 = new Integer(-1145578966);
        Object term602 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term602, term602.getClass(), "body", "");
        setField(term602, term602.getClass(), "id", term604);
        Integer term608 = new Integer(679763016);
        Object term606 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term606, term606.getClass(), "body", "");
        setField(term606, term606.getClass(), "id", term608);
        Integer term612 = new Integer(1962444399);
        Object term610 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term610, term610.getClass(), "body", "");
        setField(term610, term610.getClass(), "id", term612);
        Integer term616 = new Integer(767834723);
        Object term614 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term614, term614.getClass(), "body", "");
        setField(term614, term614.getClass(), "id", term616);
        ArrayList term580 = new ArrayList();
        ((ArrayList) term580).add(term582);
        ((ArrayList) term580).add(term586);
        ((ArrayList) term580).add(term590);
        ((ArrayList) term580).add(term594);
        ((ArrayList) term580).add(term598);
        ((ArrayList) term580).add(term602);
        ((ArrayList) term580).add(term606);
        ((ArrayList) term580).add(term610);
        ((ArrayList) term580).add(term614);
        term579 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO"));
        setField(term579, term579.getClass(), "questions", term580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term579, args);
    }

};


