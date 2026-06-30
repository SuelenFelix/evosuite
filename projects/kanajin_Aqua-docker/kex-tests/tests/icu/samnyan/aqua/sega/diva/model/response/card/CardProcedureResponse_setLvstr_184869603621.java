package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class CardProcedureResponse_setLvstr_184869603621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15623;

    public CardProcedureResponse_setLvstr_184869603621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15734 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term15733 = ((Class) term15734).getDeclaredField((String) "SUCCESS");
        ((Field) term15733).setAccessible(true);
        Object enum47 = ((Field) term15733).get((Object) null);
        Integer term15651 = new Integer(683666002);
        Integer term15653 = new Integer(1596213415);
        Integer term15667 = new Integer(-268815336);
        Integer term15669 = new Integer(-1210583429);
        Integer term15671 = new Integer(-663691365);
        Class<? extends Object> term16012 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term16011 = ((Class) term16012).getDeclaredField((String) "REISSUE");
        ((Field) term16011).setAccessible(true);
        Object enum48 = ((Field) term16011).get((Object) null);
        term15623 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term15623, term15623.getClass(), "cd_adm_result", enum47);
        setIntField(term15623, term15623.getClass(), "chg_name_price", 933028652);
        setIntField(term15623, term15623.getClass(), "accept_idx", 287287233);
        setIntField(term15623, term15623.getClass(), "pd_id", 962840079);
        setField(term15623, term15623.getClass(), "player_name", "mXGCWJDOqA");
        setField(term15623, term15623.getClass(), "lv_num", term15651);
        setField(term15623, term15623.getClass(), "lv_pnt", term15653);
        setField(term15623, term15623.getClass(), "lv_str", "dpNsDgfPso");
        setField(term15623, term15623.getClass(), "lv_efct_id", term15667);
        setField(term15623, term15623.getClass(), "lv_plt_id", term15669);
        setField(term15623, term15623.getClass(), "vcld_pts", term15671);
        setField(term15623, term15623.getClass(), "passwd_stat", enum48);
        setField(term15623, term15623.getClass(), "cmd", "hCWPJQKpdc");
        setField(term15623, term15623.getClass(), "req_id", "WzMEhMXkKx");
        setField(term15623, term15623.getClass(), "stat", "XOiDvlDhdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        callMethod(klass, "setLv_str", argTypes, term15623, args);
    }

};


