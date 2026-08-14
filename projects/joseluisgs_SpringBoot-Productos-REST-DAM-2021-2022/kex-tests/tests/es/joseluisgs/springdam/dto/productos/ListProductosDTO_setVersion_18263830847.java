package es.joseluisgs.springdam.dto.productos;

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
import static es.joseluisgs.springdam.dto.productos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ListProductosDTO_setVersion_18263830847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4699;

    public ListProductosDTO_setVersion_18263830847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4729 = new Long(-2255965562447970862L);
        Double term4732 = new Double(0.6428742553484879);
        Integer term4734 = new Integer(9726679);
        Object term4728 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4728, term4728.getClass(), "id", term4729);
        setField(term4728, term4728.getClass(), "nombre", "");
        setField(term4728, term4728.getClass(), "precio", term4732);
        setField(term4728, term4728.getClass(), "stock", term4734);
        setField(term4728, term4728.getClass(), "imagen", "");
        setField(term4728, term4728.getClass(), "createdAt", "");
        Long term4739 = new Long(148047808219672941L);
        Double term4742 = new Double(0.6584165706677267);
        Integer term4744 = new Integer(-25637976);
        Object term4738 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4738, term4738.getClass(), "id", term4739);
        setField(term4738, term4738.getClass(), "nombre", "");
        setField(term4738, term4738.getClass(), "precio", term4742);
        setField(term4738, term4738.getClass(), "stock", term4744);
        setField(term4738, term4738.getClass(), "imagen", "");
        setField(term4738, term4738.getClass(), "createdAt", "");
        Long term4749 = new Long(7489064039921396098L);
        Double term4752 = new Double(0.44268490778872205);
        Integer term4754 = new Integer(1555897383);
        Object term4748 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4748, term4748.getClass(), "id", term4749);
        setField(term4748, term4748.getClass(), "nombre", "");
        setField(term4748, term4748.getClass(), "precio", term4752);
        setField(term4748, term4748.getClass(), "stock", term4754);
        setField(term4748, term4748.getClass(), "imagen", "");
        setField(term4748, term4748.getClass(), "createdAt", "");
        Long term4759 = new Long(6843866297465638866L);
        Double term4762 = new Double(0.7507333108648018);
        Integer term4764 = new Integer(202001407);
        Object term4758 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4758, term4758.getClass(), "id", term4759);
        setField(term4758, term4758.getClass(), "nombre", "");
        setField(term4758, term4758.getClass(), "precio", term4762);
        setField(term4758, term4758.getClass(), "stock", term4764);
        setField(term4758, term4758.getClass(), "imagen", "");
        setField(term4758, term4758.getClass(), "createdAt", "");
        ArrayList term4726 = new ArrayList();
        ((ArrayList) term4726).add(term4728);
        ((ArrayList) term4726).add(term4738);
        ((ArrayList) term4726).add(term4748);
        ((ArrayList) term4726).add(term4758);
        term4699 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO"));
        Object term4700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4705 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4701, term4701.getClass(), "year", 2026);
        setShortField(term4701, term4701.getClass(), "month", (short) 8);
        setShortField(term4701, term4701.getClass(), "day", (short) 10);
        setField(term4700, term4700.getClass(), "date", term4701);
        setByteField(term4705, term4705.getClass(), "hour", (byte) 23);
        setByteField(term4705, term4705.getClass(), "minute", (byte) 15);
        setByteField(term4705, term4705.getClass(), "second", (byte) 27);
        setIntField(term4705, term4705.getClass(), "nano", 712511000);
        setField(term4700, term4700.getClass(), "time", term4705);
        setField(term4699, term4699.getClass(), "consulta", term4700);
        setField(term4699, term4699.getClass(), "project", "SpringDam");
        setField(term4699, term4699.getClass(), "version", "1.0");
        setField(term4699, term4699.getClass(), "data", term4726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ckQLZGFjMX";
        callMethod(klass, "setVersion", argTypes, term4699, args);
    }

};


