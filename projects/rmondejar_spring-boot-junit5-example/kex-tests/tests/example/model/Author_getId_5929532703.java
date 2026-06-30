package example.model;

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
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Author_getId_5929532703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;

    public Author_getId_5929532703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1104 = new Long(-8121849829073967555L);
        Long term1145 = new Long(5219030281405653303L);
        Long term1155 = new Long(-8471550651709805183L);
        Object term1144 = newInstance(Class.forName("example.model.Book"));
        Object term1150 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1154 = newInstance(Class.forName("example.model.Author"));
        setField(term1144, term1144.getClass(), "id", term1145);
        setField(term1144, term1144.getClass(), "title", "");
        setField(term1144, term1144.getClass(), "description", "");
        setField(term1144, term1144.getClass(), "genre", "");
        setField(term1150, term1150.getClass(), "intVal", null);
        setIntField(term1150, term1150.getClass(), "scale", 53);
        setIntField(term1150, term1150.getClass(), "precision", 0);
        setField(term1150, term1150.getClass(), "stringCache", null);
        setLongField(term1150, term1150.getClass(), "intCompact", -9223372036854775808L);
        setField(term1144, term1144.getClass(), "price", term1150);
        setField(term1154, term1154.getClass(), "id", term1155);
        setField(term1154, term1154.getClass(), "firstName", null);
        setField(term1154, term1154.getClass(), "lastName", null);
        setField(term1154, term1154.getClass(), "email", null);
        setField(term1154, term1154.getClass(), "books", null);
        setField(term1144, term1144.getClass(), "author", term1154);
        Long term1158 = new Long(4699157009689333952L);
        Object term1157 = newInstance(Class.forName("example.model.Book"));
        Object term1163 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1167 = newInstance(Class.forName("example.model.Author"));
        setField(term1157, term1157.getClass(), "id", term1158);
        setField(term1157, term1157.getClass(), "title", "");
        setField(term1157, term1157.getClass(), "description", "");
        setField(term1157, term1157.getClass(), "genre", "");
        setField(term1163, term1163.getClass(), "intVal", null);
        setIntField(term1163, term1163.getClass(), "scale", 53);
        setIntField(term1163, term1163.getClass(), "precision", 0);
        setField(term1163, term1163.getClass(), "stringCache", null);
        setLongField(term1163, term1163.getClass(), "intCompact", -9223372036854775808L);
        setField(term1157, term1157.getClass(), "price", term1163);
        setField(term1167, term1167.getClass(), "id", null);
        setField(term1167, term1167.getClass(), "firstName", null);
        setField(term1167, term1167.getClass(), "lastName", null);
        setField(term1167, term1167.getClass(), "email", null);
        setField(term1167, term1167.getClass(), "books", null);
        setField(term1157, term1157.getClass(), "author", term1167);
        Long term1169 = new Long(-5447369594017685765L);
        Long term1179 = new Long(-5724112525188606013L);
        Object term1168 = newInstance(Class.forName("example.model.Book"));
        Object term1174 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1178 = newInstance(Class.forName("example.model.Author"));
        setField(term1168, term1168.getClass(), "id", term1169);
        setField(term1168, term1168.getClass(), "title", "");
        setField(term1168, term1168.getClass(), "description", "");
        setField(term1168, term1168.getClass(), "genre", "");
        setField(term1174, term1174.getClass(), "intVal", null);
        setIntField(term1174, term1174.getClass(), "scale", 53);
        setIntField(term1174, term1174.getClass(), "precision", 0);
        setField(term1174, term1174.getClass(), "stringCache", null);
        setLongField(term1174, term1174.getClass(), "intCompact", -9223372036854775808L);
        setField(term1168, term1168.getClass(), "price", term1174);
        setField(term1178, term1178.getClass(), "id", term1179);
        setField(term1178, term1178.getClass(), "firstName", null);
        setField(term1178, term1178.getClass(), "lastName", null);
        setField(term1178, term1178.getClass(), "email", null);
        setField(term1178, term1178.getClass(), "books", null);
        setField(term1168, term1168.getClass(), "author", term1178);
        Long term1182 = new Long(4616440478358528406L);
        Long term1192 = new Long(3427570961451840069L);
        Object term1181 = newInstance(Class.forName("example.model.Book"));
        Object term1187 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1191 = newInstance(Class.forName("example.model.Author"));
        setField(term1181, term1181.getClass(), "id", term1182);
        setField(term1181, term1181.getClass(), "title", "");
        setField(term1181, term1181.getClass(), "description", "");
        setField(term1181, term1181.getClass(), "genre", "");
        setField(term1187, term1187.getClass(), "intVal", null);
        setIntField(term1187, term1187.getClass(), "scale", 53);
        setIntField(term1187, term1187.getClass(), "precision", 0);
        setField(term1187, term1187.getClass(), "stringCache", null);
        setLongField(term1187, term1187.getClass(), "intCompact", -9223372036854775808L);
        setField(term1181, term1181.getClass(), "price", term1187);
        setField(term1191, term1191.getClass(), "id", term1192);
        setField(term1191, term1191.getClass(), "firstName", null);
        setField(term1191, term1191.getClass(), "lastName", null);
        setField(term1191, term1191.getClass(), "email", null);
        setField(term1191, term1191.getClass(), "books", null);
        setField(term1181, term1181.getClass(), "author", term1191);
        Long term1195 = new Long(-8614778293741404325L);
        Object term1194 = newInstance(Class.forName("example.model.Book"));
        Object term1200 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1204 = newInstance(Class.forName("example.model.Author"));
        setField(term1194, term1194.getClass(), "id", term1195);
        setField(term1194, term1194.getClass(), "title", "");
        setField(term1194, term1194.getClass(), "description", "");
        setField(term1194, term1194.getClass(), "genre", "");
        setField(term1200, term1200.getClass(), "intVal", null);
        setIntField(term1200, term1200.getClass(), "scale", 50);
        setIntField(term1200, term1200.getClass(), "precision", 0);
        setField(term1200, term1200.getClass(), "stringCache", null);
        setLongField(term1200, term1200.getClass(), "intCompact", -9223372036854775808L);
        setField(term1194, term1194.getClass(), "price", term1200);
        setField(term1204, term1204.getClass(), "id", null);
        setField(term1204, term1204.getClass(), "firstName", null);
        setField(term1204, term1204.getClass(), "lastName", null);
        setField(term1204, term1204.getClass(), "email", null);
        setField(term1204, term1204.getClass(), "books", null);
        setField(term1194, term1194.getClass(), "author", term1204);
        ArrayList term1142 = new ArrayList();
        ((ArrayList) term1142).add(term1144);
        ((ArrayList) term1142).add(term1157);
        ((ArrayList) term1142).add(term1168);
        ((ArrayList) term1142).add(term1181);
        ((ArrayList) term1142).add(term1194);
        term1103 = newInstance(Class.forName("example.model.Author"));
        setField(term1103, term1103.getClass(), "id", term1104);
        setField(term1103, term1103.getClass(), "firstName", "MqICFYzDJj");
        setField(term1103, term1103.getClass(), "lastName", "YgQvdcBQKw");
        setField(term1103, term1103.getClass(), "email", "FiYYLuailz");
        setField(term1103, term1103.getClass(), "books", term1142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1103, args);
    }

};


