package br.org.serratec.mm.model;

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
import static br.org.serratec.mm.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class PlayList_hashCode_72120933313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4532;

    public PlayList_hashCode_72120933313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4533 = new Long(-3948863953565024517L);
        Long term4550 = new Long(-6587807377747738663L);
        Integer term4553 = new Integer(1632125673);
        Long term4556 = new Long(-6301101997917060727L);
        Object term4549 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term4555 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term4558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4559 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4549, term4549.getClass(), "id", term4550);
        setField(term4549, term4549.getClass(), "titulo", "");
        setField(term4549, term4549.getClass(), "minutos", term4553);
        setField(term4555, term4555.getClass(), "id", term4556);
        setField(term4555, term4555.getClass(), "email", null);
        setField(term4555, term4555.getClass(), "nome", null);
        setField(term4555, term4555.getClass(), "senha", null);
        setField(term4555, term4555.getClass(), "perfilUsuario", null);
        setField(term4555, term4555.getClass(), "dataCadastro", null);
        setField(term4555, term4555.getClass(), "dataAlteracao", null);
        setField(term4549, term4549.getClass(), "usuario", term4555);
        setField(term4558, term4558.getClass(), "date", null);
        setField(term4558, term4558.getClass(), "time", null);
        setField(term4549, term4549.getClass(), "dataCadastro", term4558);
        setField(term4559, term4559.getClass(), "date", null);
        setField(term4559, term4559.getClass(), "time", null);
        setField(term4549, term4549.getClass(), "dataAlteracao", term4559);
        ArrayList term4547 = new ArrayList();
        ((ArrayList) term4547).add(term4549);
        Long term4563 = new Long(8166095254618543564L);
        term4532 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        Object term4562 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term4613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4618 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4628 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4648 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4532, term4532.getClass(), "id", term4533);
        setField(term4532, term4532.getClass(), "nome", "KarbTXFmUU");
        setField(term4532, term4532.getClass(), "musicas", term4547);
        setField(term4562, term4562.getClass(), "id", term4563);
        setField(term4562, term4562.getClass(), "email", "OzXRsFGTIp");
        setField(term4562, term4562.getClass(), "nome", "TjWpyghUWN");
        setField(term4562, term4562.getClass(), "senha", "dkZFDZxcde");
        setField(term4562, term4562.getClass(), "perfilUsuario", "WXcZEtUKlI");
        setIntField(term4614, term4614.getClass(), "year", 2027);
        setShortField(term4614, term4614.getClass(), "month", (short) 5);
        setShortField(term4614, term4614.getClass(), "day", (short) 22);
        setField(term4613, term4613.getClass(), "date", term4614);
        setByteField(term4618, term4618.getClass(), "hour", (byte) 6);
        setByteField(term4618, term4618.getClass(), "minute", (byte) 8);
        setByteField(term4618, term4618.getClass(), "second", (byte) 27);
        setIntField(term4618, term4618.getClass(), "nano", 955380448);
        setField(term4613, term4613.getClass(), "time", term4618);
        setField(term4562, term4562.getClass(), "dataCadastro", term4613);
        setIntField(term4624, term4624.getClass(), "year", 2029);
        setShortField(term4624, term4624.getClass(), "month", (short) 1);
        setShortField(term4624, term4624.getClass(), "day", (short) 12);
        setField(term4623, term4623.getClass(), "date", term4624);
        setByteField(term4628, term4628.getClass(), "hour", (byte) 15);
        setByteField(term4628, term4628.getClass(), "minute", (byte) 27);
        setByteField(term4628, term4628.getClass(), "second", (byte) 0);
        setIntField(term4628, term4628.getClass(), "nano", 592641552);
        setField(term4623, term4623.getClass(), "time", term4628);
        setField(term4562, term4562.getClass(), "dataAlteracao", term4623);
        setField(term4532, term4532.getClass(), "usuario", term4562);
        setIntField(term4634, term4634.getClass(), "year", 2010);
        setShortField(term4634, term4634.getClass(), "month", (short) 3);
        setShortField(term4634, term4634.getClass(), "day", (short) 22);
        setField(term4633, term4633.getClass(), "date", term4634);
        setByteField(term4638, term4638.getClass(), "hour", (byte) 23);
        setByteField(term4638, term4638.getClass(), "minute", (byte) 36);
        setByteField(term4638, term4638.getClass(), "second", (byte) 22);
        setIntField(term4638, term4638.getClass(), "nano", 781575122);
        setField(term4633, term4633.getClass(), "time", term4638);
        setField(term4532, term4532.getClass(), "dataCadastro", term4633);
        setIntField(term4644, term4644.getClass(), "year", 2015);
        setShortField(term4644, term4644.getClass(), "month", (short) 8);
        setShortField(term4644, term4644.getClass(), "day", (short) 6);
        setField(term4643, term4643.getClass(), "date", term4644);
        setByteField(term4648, term4648.getClass(), "hour", (byte) 16);
        setByteField(term4648, term4648.getClass(), "minute", (byte) 16);
        setByteField(term4648, term4648.getClass(), "second", (byte) 21);
        setIntField(term4648, term4648.getClass(), "nano", 274900303);
        setField(term4643, term4643.getClass(), "time", term4648);
        setField(term4532, term4532.getClass(), "dataAlteracao", term4643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4532, args);
    }

};


