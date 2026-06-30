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

public class UserCreationResponse_getFirstName_7726014171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5614;

    public UserCreationResponse_getFirstName_7726014171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5809 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term5808 = ((Class) term5809).getDeclaredField((String) "USER");
        ((Field) term5808).setAccessible(true);
        Object enum18 = ((Field) term5808).get((Object) null);
        Class<? extends Object> term5988 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term5987 = ((Class) term5988).getDeclaredField((String) "PENDING");
        ((Field) term5987).setAccessible(true);
        Object enum19 = ((Field) term5987).get((Object) null);
        Object term5685 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5692 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5685, term5685.getClass(), "id", "");
        setField(term5685, term5685.getClass(), "imageUrl", "");
        setDoubleField(term5685, term5685.getClass(), "size", 0.3587267442738795);
        setIntField(term5685, term5685.getClass(), "quantity", 1622346318);
        setDoubleField(term5685, term5685.getClass(), "price", 0.07802449704920456);
        setField(term5691, term5691.getClass(), "date", null);
        setField(term5691, term5691.getClass(), "time", null);
        setField(term5685, term5685.getClass(), "orderDate", term5691);
        setField(term5692, term5692.getClass(), "date", null);
        setField(term5692, term5692.getClass(), "time", null);
        setField(term5685, term5685.getClass(), "deliveryDate", term5692);
        setBooleanField(term5685, term5685.getClass(), "ordered", false);
        setField(term5685, term5685.getClass(), "userId", "");
        setField(term5685, term5685.getClass(), "orderStatus", enum19);
        Class<? extends Object> term6211 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term6210 = ((Class) term6211).getDeclaredField((String) "DELIVERED");
        ((Field) term6210).setAccessible(true);
        Object enum20 = ((Field) term6210).get((Object) null);
        Object term5697 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5704 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5697, term5697.getClass(), "id", "");
        setField(term5697, term5697.getClass(), "imageUrl", "");
        setDoubleField(term5697, term5697.getClass(), "size", 0.5279279537140873);
        setIntField(term5697, term5697.getClass(), "quantity", 1048535127);
        setDoubleField(term5697, term5697.getClass(), "price", 0.3202192021706908);
        setField(term5703, term5703.getClass(), "date", null);
        setField(term5703, term5703.getClass(), "time", null);
        setField(term5697, term5697.getClass(), "orderDate", term5703);
        setField(term5704, term5704.getClass(), "date", null);
        setField(term5704, term5704.getClass(), "time", null);
        setField(term5697, term5697.getClass(), "deliveryDate", term5704);
        setBooleanField(term5697, term5697.getClass(), "ordered", false);
        setField(term5697, term5697.getClass(), "userId", "");
        setField(term5697, term5697.getClass(), "orderStatus", enum20);
        Object term5709 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5716 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5709, term5709.getClass(), "id", "");
        setField(term5709, term5709.getClass(), "imageUrl", "");
        setDoubleField(term5709, term5709.getClass(), "size", 0.22651340641904605);
        setIntField(term5709, term5709.getClass(), "quantity", -655067527);
        setDoubleField(term5709, term5709.getClass(), "price", 0.8878841294187743);
        setField(term5715, term5715.getClass(), "date", null);
        setField(term5715, term5715.getClass(), "time", null);
        setField(term5709, term5709.getClass(), "orderDate", term5715);
        setField(term5716, term5716.getClass(), "date", null);
        setField(term5716, term5716.getClass(), "time", null);
        setField(term5709, term5709.getClass(), "deliveryDate", term5716);
        setBooleanField(term5709, term5709.getClass(), "ordered", false);
        setField(term5709, term5709.getClass(), "userId", "");
        setField(term5709, term5709.getClass(), "orderStatus", enum20);
        Object term5719 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5726 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5719, term5719.getClass(), "id", "");
        setField(term5719, term5719.getClass(), "imageUrl", "");
        setDoubleField(term5719, term5719.getClass(), "size", 0.6588948704887806);
        setIntField(term5719, term5719.getClass(), "quantity", -6029667);
        setDoubleField(term5719, term5719.getClass(), "price", 0.6397214730945112);
        setField(term5725, term5725.getClass(), "date", null);
        setField(term5725, term5725.getClass(), "time", null);
        setField(term5719, term5719.getClass(), "orderDate", term5725);
        setField(term5726, term5726.getClass(), "date", null);
        setField(term5726, term5726.getClass(), "time", null);
        setField(term5719, term5719.getClass(), "deliveryDate", term5726);
        setBooleanField(term5719, term5719.getClass(), "ordered", false);
        setField(term5719, term5719.getClass(), "userId", "");
        setField(term5719, term5719.getClass(), "orderStatus", enum19);
        Object term5729 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5736 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5729, term5729.getClass(), "id", "");
        setField(term5729, term5729.getClass(), "imageUrl", "");
        setDoubleField(term5729, term5729.getClass(), "size", 0.25937345430928016);
        setIntField(term5729, term5729.getClass(), "quantity", -2068769794);
        setDoubleField(term5729, term5729.getClass(), "price", 0.5873228247510078);
        setField(term5735, term5735.getClass(), "date", null);
        setField(term5735, term5735.getClass(), "time", null);
        setField(term5729, term5729.getClass(), "orderDate", term5735);
        setField(term5736, term5736.getClass(), "date", null);
        setField(term5736, term5736.getClass(), "time", null);
        setField(term5729, term5729.getClass(), "deliveryDate", term5736);
        setBooleanField(term5729, term5729.getClass(), "ordered", true);
        setField(term5729, term5729.getClass(), "userId", "");
        setField(term5729, term5729.getClass(), "orderStatus", enum19);
        ArrayList term5683 = new ArrayList();
        ((ArrayList) term5683).add(term5685);
        ((ArrayList) term5683).add(term5697);
        ((ArrayList) term5683).add(term5709);
        ((ArrayList) term5683).add(term5719);
        ((ArrayList) term5683).add(term5729);
        term5614 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term5614, term5614.getClass(), "firstName", "xrwlQZdwCp");
        setField(term5614, term5614.getClass(), "lastName", "IDCWpPLRkE");
        setField(term5614, term5614.getClass(), "username", "nyiiPDVjAc");
        setField(term5614, term5614.getClass(), "email", "aKnKipADSo");
        setField(term5614, term5614.getClass(), "id", "wSQxaModmm");
        setField(term5614, term5614.getClass(), "role", enum18);
        setField(term5614, term5614.getClass(), "orders", term5683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term5614, args);
    }

};


