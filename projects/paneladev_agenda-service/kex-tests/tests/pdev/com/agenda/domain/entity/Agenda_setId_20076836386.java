package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Agenda_setId_20076836386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1764;
     Object term1884;

    public Agenda_setId_20076836386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1765 = new Long(-3838084482494604218L);
        Long term1800 = new Long(3892018155439224435L);
        Long term1853 = new Long(5953383087795962419L);
        Long term1855 = new Long(7994303628307559416L);
        Object term1852 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1852, term1852.getClass(), "id", term1853);
        setField(term1852, term1852.getClass(), "rua", null);
        setField(term1852, term1852.getClass(), "numero", term1855);
        setField(term1852, term1852.getClass(), "complemento", null);
        setField(term1852, term1852.getClass(), "bairro", null);
        Long term1858 = new Long(2443640364875054177L);
        Long term1860 = new Long(-1610676979013636850L);
        Object term1857 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1857, term1857.getClass(), "id", term1858);
        setField(term1857, term1857.getClass(), "rua", null);
        setField(term1857, term1857.getClass(), "numero", term1860);
        setField(term1857, term1857.getClass(), "complemento", null);
        setField(term1857, term1857.getClass(), "bairro", null);
        Long term1863 = new Long(2062173786000223358L);
        Long term1865 = new Long(-8658027316505137504L);
        Object term1862 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1862, term1862.getClass(), "id", term1863);
        setField(term1862, term1862.getClass(), "rua", null);
        setField(term1862, term1862.getClass(), "numero", term1865);
        setField(term1862, term1862.getClass(), "complemento", null);
        setField(term1862, term1862.getClass(), "bairro", null);
        Long term1868 = new Long(414749984815662075L);
        Long term1870 = new Long(463622836963501975L);
        Object term1867 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1867, term1867.getClass(), "id", term1868);
        setField(term1867, term1867.getClass(), "rua", null);
        setField(term1867, term1867.getClass(), "numero", term1870);
        setField(term1867, term1867.getClass(), "complemento", null);
        setField(term1867, term1867.getClass(), "bairro", null);
        Long term1873 = new Long(305759998609888272L);
        Long term1875 = new Long(-8654565919063661957L);
        Object term1872 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1872, term1872.getClass(), "id", term1873);
        setField(term1872, term1872.getClass(), "rua", null);
        setField(term1872, term1872.getClass(), "numero", term1875);
        setField(term1872, term1872.getClass(), "complemento", null);
        setField(term1872, term1872.getClass(), "bairro", null);
        Long term1878 = new Long(-5248475803419977214L);
        Long term1880 = new Long(-6723783499250797216L);
        Object term1877 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1877, term1877.getClass(), "id", term1878);
        setField(term1877, term1877.getClass(), "rua", null);
        setField(term1877, term1877.getClass(), "numero", term1880);
        setField(term1877, term1877.getClass(), "complemento", null);
        setField(term1877, term1877.getClass(), "bairro", null);
        ArrayList term1850 = new ArrayList();
        ((ArrayList) term1850).add(term1852);
        ((ArrayList) term1850).add(term1857);
        ((ArrayList) term1850).add(term1862);
        ((ArrayList) term1850).add(term1867);
        ((ArrayList) term1850).add(term1872);
        ((ArrayList) term1850).add(term1877);
        term1764 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term1779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1784 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1794 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1799 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term1764, term1764.getClass(), "id", term1765);
        setField(term1764, term1764.getClass(), "descricao", "pORebkoRdD");
        setIntField(term1780, term1780.getClass(), "year", 2019);
        setShortField(term1780, term1780.getClass(), "month", (short) 2);
        setShortField(term1780, term1780.getClass(), "day", (short) 21);
        setField(term1779, term1779.getClass(), "date", term1780);
        setByteField(term1784, term1784.getClass(), "hour", (byte) 5);
        setByteField(term1784, term1784.getClass(), "minute", (byte) 41);
        setByteField(term1784, term1784.getClass(), "second", (byte) 11);
        setIntField(term1784, term1784.getClass(), "nano", 859829782);
        setField(term1779, term1779.getClass(), "time", term1784);
        setField(term1764, term1764.getClass(), "horario", term1779);
        setIntField(term1790, term1790.getClass(), "year", 2018);
        setShortField(term1790, term1790.getClass(), "month", (short) 9);
        setShortField(term1790, term1790.getClass(), "day", (short) 28);
        setField(term1789, term1789.getClass(), "date", term1790);
        setByteField(term1794, term1794.getClass(), "hour", (byte) 3);
        setByteField(term1794, term1794.getClass(), "minute", (byte) 37);
        setByteField(term1794, term1794.getClass(), "second", (byte) 46);
        setIntField(term1794, term1794.getClass(), "nano", 763326845);
        setField(term1789, term1789.getClass(), "time", term1794);
        setField(term1764, term1764.getClass(), "dataCriacao", term1789);
        setField(term1799, term1799.getClass(), "id", term1800);
        setField(term1799, term1799.getClass(), "nome", "mXGCWJDOqA");
        setField(term1799, term1799.getClass(), "sobrenome", "dpNsDgfPso");
        setField(term1799, term1799.getClass(), "email", "hCWPJQKpdc");
        setField(term1799, term1799.getClass(), "cpf", "WzMEhMXkKx");
        setField(term1799, term1799.getClass(), "enderecos", term1850);
        setField(term1764, term1764.getClass(), "paciente", term1799);
        term1884 = new Long(41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1884;
        callMethod(klass, "setId", argTypes, term1764, args);
    }

};


