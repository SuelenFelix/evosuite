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

public class CardProcedureResponse_setLvefctid_4277272622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16319;
     Object term16417;

    public CardProcedureResponse_setLvefctid_4277272622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16420 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term16419 = ((Class) term16420).getDeclaredField((String) "SUCCESS");
        ((Field) term16419).setAccessible(true);
        Object enum49 = ((Field) term16419).get((Object) null);
        Integer term16347 = new Integer(339854490);
        Integer term16349 = new Integer(-615654495);
        Integer term16363 = new Integer(-1476117762);
        Integer term16365 = new Integer(-341962980);
        Integer term16367 = new Integer(1532716628);
        Class<? extends Object> term16698 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term16697 = ((Class) term16698).getDeclaredField((String) "REISSUE");
        ((Field) term16697).setAccessible(true);
        Object enum50 = ((Field) term16697).get((Object) null);
        term16319 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term16319, term16319.getClass(), "cd_adm_result", enum49);
        setIntField(term16319, term16319.getClass(), "chg_name_price", 1540719661);
        setIntField(term16319, term16319.getClass(), "accept_idx", 1265463001);
        setIntField(term16319, term16319.getClass(), "pd_id", 335112684);
        setField(term16319, term16319.getClass(), "player_name", "lHfTrWKMPk");
        setField(term16319, term16319.getClass(), "lv_num", term16347);
        setField(term16319, term16319.getClass(), "lv_pnt", term16349);
        setField(term16319, term16319.getClass(), "lv_str", "JDaAnsVTGV");
        setField(term16319, term16319.getClass(), "lv_efct_id", term16363);
        setField(term16319, term16319.getClass(), "lv_plt_id", term16365);
        setField(term16319, term16319.getClass(), "vcld_pts", term16367);
        setField(term16319, term16319.getClass(), "passwd_stat", enum50);
        setField(term16319, term16319.getClass(), "cmd", "mLUZFTfjle");
        setField(term16319, term16319.getClass(), "req_id", "xIeFjkHkOe");
        setField(term16319, term16319.getClass(), "stat", "SdCKLMIYnX");
        term16417 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term16417;
        callMethod(klass, "setLv_efct_id", argTypes, term16319, args);
    }

};


