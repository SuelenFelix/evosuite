package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class UserCreationResponse_hashCode_94766725617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19227;

    public UserCreationResponse_hashCode_94766725617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19428 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term19427 = ((Class) term19428).getDeclaredField((String) "ADMIN");
        ((Field) term19427).setAccessible(true);
        Object enum69 = ((Field) term19427).get((Object) null);
        Class<? extends Object> term19610 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term19609 = ((Class) term19610).getDeclaredField((String) "PENDING");
        ((Field) term19609).setAccessible(true);
        Object enum70 = ((Field) term19609).get((Object) null);
        Object term19299 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term19305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19306 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term19299, term19299.getClass(), "id", "");
        setField(term19299, term19299.getClass(), "imageUrl", "");
        setDoubleField(term19299, term19299.getClass(), "size", 0.1849998667663698);
        setIntField(term19299, term19299.getClass(), "quantity", -344842608);
        setDoubleField(term19299, term19299.getClass(), "price", 0.36312400202399575);
        setField(term19305, term19305.getClass(), "date", null);
        setField(term19305, term19305.getClass(), "time", null);
        setField(term19299, term19299.getClass(), "orderDate", term19305);
        setField(term19306, term19306.getClass(), "date", null);
        setField(term19306, term19306.getClass(), "time", null);
        setField(term19299, term19299.getClass(), "deliveryDate", term19306);
        setBooleanField(term19299, term19299.getClass(), "ordered", false);
        setField(term19299, term19299.getClass(), "userId", "");
        setField(term19299, term19299.getClass(), "orderStatus", enum70);
        Class<? extends Object> term19833 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term19832 = ((Class) term19833).getDeclaredField((String) "PENDING");
        ((Field) term19832).setAccessible(true);
        Object enum71 = ((Field) term19832).get((Object) null);
        Object term19311 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term19317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19318 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term19311, term19311.getClass(), "id", "");
        setField(term19311, term19311.getClass(), "imageUrl", "");
        setDoubleField(term19311, term19311.getClass(), "size", 0.5485690030548175);
        setIntField(term19311, term19311.getClass(), "quantity", 941650513);
        setDoubleField(term19311, term19311.getClass(), "price", 0.9765248027281291);
        setField(term19317, term19317.getClass(), "date", null);
        setField(term19317, term19317.getClass(), "time", null);
        setField(term19311, term19311.getClass(), "orderDate", term19317);
        setField(term19318, term19318.getClass(), "date", null);
        setField(term19318, term19318.getClass(), "time", null);
        setField(term19311, term19311.getClass(), "deliveryDate", term19318);
        setBooleanField(term19311, term19311.getClass(), "ordered", true);
        setField(term19311, term19311.getClass(), "userId", "");
        setField(term19311, term19311.getClass(), "orderStatus", enum71);
        Class<? extends Object> term20056 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term20055 = ((Class) term20056).getDeclaredField((String) "PENDING");
        ((Field) term20055).setAccessible(true);
        Object enum72 = ((Field) term20055).get((Object) null);
        Object term19323 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term19329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19330 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term19323, term19323.getClass(), "id", "");
        setField(term19323, term19323.getClass(), "imageUrl", "");
        setDoubleField(term19323, term19323.getClass(), "size", 0.9184034277897645);
        setIntField(term19323, term19323.getClass(), "quantity", 444029505);
        setDoubleField(term19323, term19323.getClass(), "price", 0.9457448635091538);
        setField(term19329, term19329.getClass(), "date", null);
        setField(term19329, term19329.getClass(), "time", null);
        setField(term19323, term19323.getClass(), "orderDate", term19329);
        setField(term19330, term19330.getClass(), "date", null);
        setField(term19330, term19330.getClass(), "time", null);
        setField(term19323, term19323.getClass(), "deliveryDate", term19330);
        setBooleanField(term19323, term19323.getClass(), "ordered", false);
        setField(term19323, term19323.getClass(), "userId", "");
        setField(term19323, term19323.getClass(), "orderStatus", enum72);
        Object term19335 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term19341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19342 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term19335, term19335.getClass(), "id", "");
        setField(term19335, term19335.getClass(), "imageUrl", "");
        setDoubleField(term19335, term19335.getClass(), "size", 0.3238255203811462);
        setIntField(term19335, term19335.getClass(), "quantity", -1034506028);
        setDoubleField(term19335, term19335.getClass(), "price", 0.2843894095932772);
        setField(term19341, term19341.getClass(), "date", null);
        setField(term19341, term19341.getClass(), "time", null);
        setField(term19335, term19335.getClass(), "orderDate", term19341);
        setField(term19342, term19342.getClass(), "date", null);
        setField(term19342, term19342.getClass(), "time", null);
        setField(term19335, term19335.getClass(), "deliveryDate", term19342);
        setBooleanField(term19335, term19335.getClass(), "ordered", false);
        setField(term19335, term19335.getClass(), "userId", "");
        setField(term19335, term19335.getClass(), "orderStatus", enum72);
        Object term19345 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term19351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19352 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term19345, term19345.getClass(), "id", "");
        setField(term19345, term19345.getClass(), "imageUrl", "");
        setDoubleField(term19345, term19345.getClass(), "size", 0.2382345237223229);
        setIntField(term19345, term19345.getClass(), "quantity", -1263114719);
        setDoubleField(term19345, term19345.getClass(), "price", 0.6037093070161561);
        setField(term19351, term19351.getClass(), "date", null);
        setField(term19351, term19351.getClass(), "time", null);
        setField(term19345, term19345.getClass(), "orderDate", term19351);
        setField(term19352, term19352.getClass(), "date", null);
        setField(term19352, term19352.getClass(), "time", null);
        setField(term19345, term19345.getClass(), "deliveryDate", term19352);
        setBooleanField(term19345, term19345.getClass(), "ordered", true);
        setField(term19345, term19345.getClass(), "userId", "");
        setField(term19345, term19345.getClass(), "orderStatus", enum70);
        Object term19355 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term19361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19362 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term19355, term19355.getClass(), "id", "");
        setField(term19355, term19355.getClass(), "imageUrl", "");
        setDoubleField(term19355, term19355.getClass(), "size", 0.48050706663913145);
        setIntField(term19355, term19355.getClass(), "quantity", -894662986);
        setDoubleField(term19355, term19355.getClass(), "price", 0.4990217874180345);
        setField(term19361, term19361.getClass(), "date", null);
        setField(term19361, term19361.getClass(), "time", null);
        setField(term19355, term19355.getClass(), "orderDate", term19361);
        setField(term19362, term19362.getClass(), "date", null);
        setField(term19362, term19362.getClass(), "time", null);
        setField(term19355, term19355.getClass(), "deliveryDate", term19362);
        setBooleanField(term19355, term19355.getClass(), "ordered", false);
        setField(term19355, term19355.getClass(), "userId", "");
        setField(term19355, term19355.getClass(), "orderStatus", enum71);
        Object term19365 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term19371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19372 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term19365, term19365.getClass(), "id", "");
        setField(term19365, term19365.getClass(), "imageUrl", "");
        setDoubleField(term19365, term19365.getClass(), "size", 0.22767631814145395);
        setIntField(term19365, term19365.getClass(), "quantity", 304775596);
        setDoubleField(term19365, term19365.getClass(), "price", 0.4630082575704827);
        setField(term19371, term19371.getClass(), "date", null);
        setField(term19371, term19371.getClass(), "time", null);
        setField(term19365, term19365.getClass(), "orderDate", term19371);
        setField(term19372, term19372.getClass(), "date", null);
        setField(term19372, term19372.getClass(), "time", null);
        setField(term19365, term19365.getClass(), "deliveryDate", term19372);
        setBooleanField(term19365, term19365.getClass(), "ordered", false);
        setField(term19365, term19365.getClass(), "userId", "");
        setField(term19365, term19365.getClass(), "orderStatus", enum70);
        ArrayList term19297 = new ArrayList();
        ((ArrayList) term19297).add(term19299);
        ((ArrayList) term19297).add(term19311);
        ((ArrayList) term19297).add(term19323);
        ((ArrayList) term19297).add(term19335);
        ((ArrayList) term19297).add(term19345);
        ((ArrayList) term19297).add(term19355);
        ((ArrayList) term19297).add(term19365);
        term19227 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term19227, term19227.getClass(), "firstName", "JkgoRtImdE");
        setField(term19227, term19227.getClass(), "lastName", "qFGKIJjlmV");
        setField(term19227, term19227.getClass(), "username", "IHqvyhMtuM");
        setField(term19227, term19227.getClass(), "email", "dAldIGYAXV");
        setField(term19227, term19227.getClass(), "id", "mLwibAPEsa");
        setField(term19227, term19227.getClass(), "role", enum69);
        setField(term19227, term19227.getClass(), "orders", term19297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term19227, args);
    }

};


