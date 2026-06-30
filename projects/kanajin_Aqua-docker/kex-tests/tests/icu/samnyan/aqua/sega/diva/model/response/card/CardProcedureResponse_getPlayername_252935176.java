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

public class CardProcedureResponse_getPlayername_252935176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5657;

    public CardProcedureResponse_getPlayername_252935176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5755 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term5754 = ((Class) term5755).getDeclaredField((String) "FAILED");
        ((Field) term5754).setAccessible(true);
        Object enum17 = ((Field) term5754).get((Object) null);
        Integer term5684 = new Integer(1135664017);
        Integer term5686 = new Integer(590364439);
        Integer term5700 = new Integer(865208305);
        Integer term5702 = new Integer(-1275173084);
        Integer term5704 = new Integer(-244121226);
        Class<? extends Object> term6030 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term6029 = ((Class) term6030).getDeclaredField((String) "REISSUE");
        ((Field) term6029).setAccessible(true);
        Object enum18 = ((Field) term6029).get((Object) null);
        term5657 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term5657, term5657.getClass(), "cd_adm_result", enum17);
        setIntField(term5657, term5657.getClass(), "chg_name_price", -6029667);
        setIntField(term5657, term5657.getClass(), "accept_idx", -2068769794);
        setIntField(term5657, term5657.getClass(), "pd_id", -117576464);
        setField(term5657, term5657.getClass(), "player_name", "hxCBltsObl");
        setField(term5657, term5657.getClass(), "lv_num", term5684);
        setField(term5657, term5657.getClass(), "lv_pnt", term5686);
        setField(term5657, term5657.getClass(), "lv_str", "BndsHwAFMv");
        setField(term5657, term5657.getClass(), "lv_efct_id", term5700);
        setField(term5657, term5657.getClass(), "lv_plt_id", term5702);
        setField(term5657, term5657.getClass(), "vcld_pts", term5704);
        setField(term5657, term5657.getClass(), "passwd_stat", enum18);
        setField(term5657, term5657.getClass(), "cmd", "GzFkzHGYFt");
        setField(term5657, term5657.getClass(), "req_id", "tShwQLRGNe");
        setField(term5657, term5657.getClass(), "stat", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_name", argTypes, term5657, args);
    }

};


