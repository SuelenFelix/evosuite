package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeSet_init_5137157163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97844;

    public EdgeSet_init_5137157163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term97860 = new Double(0.24386896688203952);
        Double term97862 = new Double(0.33650824379057453);
        Double term97864 = new Double(0.5191680850819778);
        Double term97866 = new Double(0.49591925980210916);
        Double term97873 = new Double(0.7120592018058269);
        Double term97875 = new Double(0.9306262668515027);
        Double term97877 = new Double(0.3897971128913206);
        Double term97879 = new Double(0.697625539365438);
        Double term97881 = new Double(0.2170446731874749);
        Double term97883 = new Double(0.7412534377270371);
        Double term97890 = new Double(0.2610608910723019);
        Double term97892 = new Double(0.46738526389049295);
        Double term97894 = new Double(0.2768470919610353);
        Double term97896 = new Double(0.3748057502836176);
        Double term97898 = new Double(0.5731930829917865);
        Double term97900 = new Double(0.7539051746561026);
        Double term97902 = new Double(0.02005712174177421);
        Double term97904 = new Double(0.5083146266420581);
        Double term97906 = new Double(0.9079395441784993);
        Double term97913 = new Double(0.5089649018567155);
        Double term97915 = new Double(0.43450494104339743);
        Double term97917 = new Double(0.033779151946421004);
        Double term97919 = new Double(0.6244268006923053);
        Double term97926 = new Double(0.7143627594521448);
        Double term97928 = new Double(0.11515719123986734);
        Double term97930 = new Double(0.6413275352493107);
        Double term97932 = new Double(0.9220677404866297);
        Double term97934 = new Double(0.4631036210522135);
        Double term97936 = new Double(0.5673015329740946);
        Double term97938 = new Double(0.24319604766284109);
        Double term97940 = new Double(0.6819755234378504);
        Double term97942 = new Double(0.7649032655562676);
        Double term97949 = new Double(0.8134618920903623);
        Double term97951 = new Double(0.8407288422993372);
        Double term97953 = new Double(0.9588643380074068);
        term97844 = (Object[]) newArray("org.graph4j.Edge", 8);
        Object term97845 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97849 = (Object[]) newArray("java.lang.Double", 0);
        Object term97850 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97854 = (Object[]) newArray("java.lang.Double", 0);
        Object term97855 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97859 = (Object[]) newArray("java.lang.Double", 4);
        Object term97868 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97872 = (Object[]) newArray("java.lang.Double", 6);
        Object term97885 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97889 = (Object[]) newArray("java.lang.Double", 9);
        Object term97908 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97912 = (Object[]) newArray("java.lang.Double", 4);
        Object term97921 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97925 = (Object[]) newArray("java.lang.Double", 9);
        Object term97944 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term97948 = (Object[]) newArray("java.lang.Double", 3);
        setBooleanField(term97845, term97845.getClass(), "directed", true);
        setIntField(term97845, term97845.getClass(), "source", 44009888);
        setIntField(term97845, term97845.getClass(), "target", -513392311);
        setField(term97845, term97845.getClass(), "data", term97849);
        setField(term97845, term97845.getClass(), "label", null);
        setElement(term97844, 0, term97845);
        setBooleanField(term97850, term97850.getClass(), "directed", false);
        setIntField(term97850, term97850.getClass(), "source", 1354727885);
        setIntField(term97850, term97850.getClass(), "target", 1202764688);
        setField(term97850, term97850.getClass(), "data", term97854);
        setField(term97850, term97850.getClass(), "label", null);
        setElement(term97844, 1, term97850);
        setBooleanField(term97855, term97855.getClass(), "directed", false);
        setIntField(term97855, term97855.getClass(), "source", 1198986574);
        setIntField(term97855, term97855.getClass(), "target", 1496477362);
        setElement(term97859, 0, term97860);
        setElement(term97859, 1, term97862);
        setElement(term97859, 2, term97864);
        setElement(term97859, 3, term97866);
        setField(term97855, term97855.getClass(), "data", term97859);
        setField(term97855, term97855.getClass(), "label", null);
        setElement(term97844, 2, term97855);
        setBooleanField(term97868, term97868.getClass(), "directed", true);
        setIntField(term97868, term97868.getClass(), "source", 694634515);
        setIntField(term97868, term97868.getClass(), "target", -1684684863);
        setElement(term97872, 0, term97873);
        setElement(term97872, 1, term97875);
        setElement(term97872, 2, term97877);
        setElement(term97872, 3, term97879);
        setElement(term97872, 4, term97881);
        setElement(term97872, 5, term97883);
        setField(term97868, term97868.getClass(), "data", term97872);
        setField(term97868, term97868.getClass(), "label", null);
        setElement(term97844, 3, term97868);
        setBooleanField(term97885, term97885.getClass(), "directed", true);
        setIntField(term97885, term97885.getClass(), "source", -1337880590);
        setIntField(term97885, term97885.getClass(), "target", -40671465);
        setElement(term97889, 0, term97890);
        setElement(term97889, 1, term97892);
        setElement(term97889, 2, term97894);
        setElement(term97889, 3, term97896);
        setElement(term97889, 4, term97898);
        setElement(term97889, 5, term97900);
        setElement(term97889, 6, term97902);
        setElement(term97889, 7, term97904);
        setElement(term97889, 8, term97906);
        setField(term97885, term97885.getClass(), "data", term97889);
        setField(term97885, term97885.getClass(), "label", null);
        setElement(term97844, 4, term97885);
        setBooleanField(term97908, term97908.getClass(), "directed", true);
        setIntField(term97908, term97908.getClass(), "source", 906922634);
        setIntField(term97908, term97908.getClass(), "target", 50121333);
        setElement(term97912, 0, term97913);
        setElement(term97912, 1, term97915);
        setElement(term97912, 2, term97917);
        setElement(term97912, 3, term97919);
        setField(term97908, term97908.getClass(), "data", term97912);
        setField(term97908, term97908.getClass(), "label", null);
        setElement(term97844, 5, term97908);
        setBooleanField(term97921, term97921.getClass(), "directed", false);
        setIntField(term97921, term97921.getClass(), "source", 1552254538);
        setIntField(term97921, term97921.getClass(), "target", -66330072);
        setElement(term97925, 0, term97926);
        setElement(term97925, 1, term97928);
        setElement(term97925, 2, term97930);
        setElement(term97925, 3, term97932);
        setElement(term97925, 4, term97934);
        setElement(term97925, 5, term97936);
        setElement(term97925, 6, term97938);
        setElement(term97925, 7, term97940);
        setElement(term97925, 8, term97942);
        setField(term97921, term97921.getClass(), "data", term97925);
        setField(term97921, term97921.getClass(), "label", null);
        setElement(term97844, 6, term97921);
        setBooleanField(term97944, term97944.getClass(), "directed", false);
        setIntField(term97944, term97944.getClass(), "source", 1911156222);
        setIntField(term97944, term97944.getClass(), "target", -595089281);
        setElement(term97948, 0, term97949);
        setElement(term97948, 1, term97951);
        setElement(term97948, 2, term97953);
        setField(term97944, term97944.getClass(), "data", term97948);
        setField(term97944, term97944.getClass(), "label", null);
        setElement(term97844, 7, term97944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term97844;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


