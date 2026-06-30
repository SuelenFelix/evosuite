package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PreStartResponse_setNblsslttstts_55234776826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273226;
     Object term273373;

    public PreStartResponse_setNblsslttstts_55234776826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term273376 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term273375 = ((Class) term273376).getDeclaredField((String) "SUCCESS");
        ((Field) term273375).setAccessible(true);
        Object enum654 = ((Field) term273375).get((Object) null);
        Integer term273239 = new Integer(-434468428);
        Integer term273241 = new Integer(1559605714);
        Integer term273243 = new Integer(1146601902);
        Integer term273245 = new Integer(-1938881385);
        Integer term273247 = new Integer(-1629418973);
        Class<? extends Object> term273684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term273683 = ((Class) term273684).getDeclaredField((String) "MY_LIST_C");
        ((Field) term273683).setAccessible(true);
        Object enum655 = ((Field) term273683).get((Object) null);
        Integer term273275 = new Integer(-100825168);
        Integer term273277 = new Integer(768407648);
        Integer term273291 = new Integer(-350454594);
        Integer term273293 = new Integer(-1148142995);
        Integer term273317 = new Integer(-233024044);
        Integer term273319 = new Integer(1820784228);
        Integer term273321 = new Integer(1390820006);
        Integer term273323 = new Integer(-828982065);
        Integer term273325 = new Integer(1221443226);
        Integer term273327 = new Integer(908108726);
        Class<? extends Object> term273978 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term273977 = ((Class) term273978).getDeclaredField((String) "SET");
        ((Field) term273977).setAccessible(true);
        Object enum656 = ((Field) term273977).get((Object) null);
        term273226 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term273307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273312 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term273226, term273226.getClass(), "ps_result", enum654);
        setField(term273226, term273226.getClass(), "accept_idx", term273239);
        setField(term273226, term273226.getClass(), "nblss_ltt_stts", term273241);
        setField(term273226, term273226.getClass(), "nblss_ltt_tckt", term273243);
        setField(term273226, term273226.getClass(), "nblss_ltt_is_opn", term273245);
        setField(term273226, term273226.getClass(), "pd_id", term273247);
        setField(term273226, term273226.getClass(), "player_name", "eywpqasaKj");
        setField(term273226, term273226.getClass(), "sort_kind", enum655);
        setField(term273226, term273226.getClass(), "lv_num", term273275);
        setField(term273226, term273226.getClass(), "lv_pnt", term273277);
        setField(term273226, term273226.getClass(), "lv_str", "QnaLMKXAzJ");
        setField(term273226, term273226.getClass(), "lv_efct_id", term273291);
        setField(term273226, term273226.getClass(), "lv_plt_id", term273293);
        setField(term273226, term273226.getClass(), "mdl_eqp_ary", "QrHmFoeUoY");
        setIntField(term273308, term273308.getClass(), "year", 2012);
        setShortField(term273308, term273308.getClass(), "month", (short) 10);
        setShortField(term273308, term273308.getClass(), "day", (short) 1);
        setField(term273307, term273307.getClass(), "date", term273308);
        setByteField(term273312, term273312.getClass(), "hour", (byte) 9);
        setByteField(term273312, term273312.getClass(), "minute", (byte) 27);
        setByteField(term273312, term273312.getClass(), "second", (byte) 33);
        setIntField(term273312, term273312.getClass(), "nano", 714912000);
        setField(term273307, term273307.getClass(), "time", term273312);
        setField(term273226, term273226.getClass(), "mdl_eqp_tm", term273307);
        setField(term273226, term273226.getClass(), "skn_eqp", term273317);
        setField(term273226, term273226.getClass(), "btn_se_eqp", term273319);
        setField(term273226, term273226.getClass(), "sld_se_eqp", term273321);
        setField(term273226, term273226.getClass(), "chn_sld_se_eqp", term273323);
        setField(term273226, term273226.getClass(), "sldr_tch_se_eqp", term273325);
        setField(term273226, term273226.getClass(), "vcld_pts", term273327);
        setField(term273226, term273226.getClass(), "passwd_stat", enum656);
        setField(term273226, term273226.getClass(), "cmd", "BIysFVoAAl");
        setField(term273226, term273226.getClass(), "req_id", "TAqcGSOgIz");
        setField(term273226, term273226.getClass(), "stat", "hqyMxHWbGv");
        term273373 = new Integer(1023209512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term273373;
        callMethod(klass, "setNblss_ltt_stts", argTypes, term273226, args);
    }

};


