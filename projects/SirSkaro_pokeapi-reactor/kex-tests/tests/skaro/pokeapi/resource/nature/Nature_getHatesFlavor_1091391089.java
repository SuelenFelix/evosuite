package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getHatesFlavor_1091391089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1880;

    public Nature_getHatesFlavor_1091391089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1881 = new Integer(-1339778481);
        Object term1997 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1999 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1997, term1997.getClass(), "name", "");
        setField(term1999, term1999.getClass(), "name", null);
        setField(term1999, term1999.getClass(), "url", null);
        setField(term1997, term1997.getClass(), "language", term1999);
        Object term2000 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2002 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2000, term2000.getClass(), "name", "");
        setField(term2002, term2002.getClass(), "name", null);
        setField(term2002, term2002.getClass(), "url", null);
        setField(term2000, term2000.getClass(), "language", term2002);
        Object term2003 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2005 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2003, term2003.getClass(), "name", "");
        setField(term2005, term2005.getClass(), "name", null);
        setField(term2005, term2005.getClass(), "url", null);
        setField(term2003, term2003.getClass(), "language", term2005);
        Object term2006 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2008 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2006, term2006.getClass(), "name", "");
        setField(term2008, term2008.getClass(), "name", null);
        setField(term2008, term2008.getClass(), "url", null);
        setField(term2006, term2006.getClass(), "language", term2008);
        Object term2009 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2011 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2009, term2009.getClass(), "name", "");
        setField(term2011, term2011.getClass(), "name", null);
        setField(term2011, term2011.getClass(), "url", null);
        setField(term2009, term2009.getClass(), "language", term2011);
        Object term2012 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2014 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2012, term2012.getClass(), "name", "");
        setField(term2014, term2014.getClass(), "name", null);
        setField(term2014, term2014.getClass(), "url", null);
        setField(term2012, term2012.getClass(), "language", term2014);
        Object term2015 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term2015, term2015.getClass(), "name", "");
        setField(term2015, term2015.getClass(), "language", term2008);
        ArrayList term1995 = new ArrayList();
        ((ArrayList) term1995).add(term1997);
        ((ArrayList) term1995).add(term2000);
        ((ArrayList) term1995).add(term2003);
        ((ArrayList) term1995).add(term2006);
        ((ArrayList) term1995).add(term2009);
        ((ArrayList) term1995).add(term2012);
        ((ArrayList) term1995).add(term2015);
        term1880 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term1895 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1920 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1945 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1970 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1880, term1880.getClass(), "id", term1881);
        setField(term1880, term1880.getClass(), "name", "xtftXXMbem");
        setField(term1895, term1895.getClass(), "name", "cudZvLMQon");
        setField(term1895, term1895.getClass(), "url", "lihXWlGDxk");
        setField(term1880, term1880.getClass(), "decreasedStat", term1895);
        setField(term1920, term1920.getClass(), "name", "JmcmxoGhIK");
        setField(term1920, term1920.getClass(), "url", "jXzmYyrnnT");
        setField(term1880, term1880.getClass(), "increasedStat", term1920);
        setField(term1945, term1945.getClass(), "name", "igCAtimmYB");
        setField(term1945, term1945.getClass(), "url", "DyiXbeYIaN");
        setField(term1880, term1880.getClass(), "hatesFlavor", term1945);
        setField(term1970, term1970.getClass(), "name", "VGizxZnyHX");
        setField(term1970, term1970.getClass(), "url", "kVEZMHmRtR");
        setField(term1880, term1880.getClass(), "likesFlavor", term1970);
        setField(term1880, term1880.getClass(), "names", term1995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHatesFlavor", argTypes, term1880, args);
    }

};


