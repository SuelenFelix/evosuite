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

public class CardProcedureResponse_setPlayername_12834433318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13623;

    public CardProcedureResponse_setPlayername_12834433318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13731 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term13730 = ((Class) term13731).getDeclaredField((String) "FAILED");
        ((Field) term13730).setAccessible(true);
        Object enum41 = ((Field) term13730).get((Object) null);
        Integer term13650 = new Integer(1090617576);
        Integer term13652 = new Integer(-1547384488);
        Integer term13666 = new Integer(1442160736);
        Integer term13668 = new Integer(1114000454);
        Integer term13670 = new Integer(-556405712);
        Class<? extends Object> term14006 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term14005 = ((Class) term14006).getDeclaredField((String) "RESET");
        ((Field) term14005).setAccessible(true);
        Object enum42 = ((Field) term14005).get((Object) null);
        term13623 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term13623, term13623.getClass(), "cd_adm_result", enum41);
        setIntField(term13623, term13623.getClass(), "chg_name_price", 1596070772);
        setIntField(term13623, term13623.getClass(), "accept_idx", 97029295);
        setIntField(term13623, term13623.getClass(), "pd_id", -1371869594);
        setField(term13623, term13623.getClass(), "player_name", "vjxIhXHxGR");
        setField(term13623, term13623.getClass(), "lv_num", term13650);
        setField(term13623, term13623.getClass(), "lv_pnt", term13652);
        setField(term13623, term13623.getClass(), "lv_str", "QXzGXbEXMu");
        setField(term13623, term13623.getClass(), "lv_efct_id", term13666);
        setField(term13623, term13623.getClass(), "lv_plt_id", term13668);
        setField(term13623, term13623.getClass(), "vcld_pts", term13670);
        setField(term13623, term13623.getClass(), "passwd_stat", enum42);
        setField(term13623, term13623.getClass(), "cmd", "qxSDVejjiY");
        setField(term13623, term13623.getClass(), "req_id", "xBsXSDjXYK");
        setField(term13623, term13623.getClass(), "stat", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setPlayer_name", argTypes, term13623, args);
    }

};


