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

public class CardProcedureResponse_getChgnameprice_16274979873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3675;

    public CardProcedureResponse_getChgnameprice_16274979873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3770 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term3769 = ((Class) term3770).getDeclaredField((String) "SUCCESS");
        ((Field) term3769).setAccessible(true);
        Object enum11 = ((Field) term3769).get((Object) null);
        Integer term3703 = new Integer(1725571209);
        Integer term3705 = new Integer(-522618178);
        Integer term3719 = new Integer(1134449235);
        Integer term3721 = new Integer(-883034806);
        Integer term3723 = new Integer(1585847225);
        Class<? extends Object> term4048 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4047 = ((Class) term4048).getDeclaredField((String) "SET");
        ((Field) term4047).setAccessible(true);
        Object enum12 = ((Field) term4047).get((Object) null);
        term3675 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term3675, term3675.getClass(), "cd_adm_result", enum11);
        setIntField(term3675, term3675.getClass(), "chg_name_price", 1134449235);
        setIntField(term3675, term3675.getClass(), "accept_idx", -883034806);
        setIntField(term3675, term3675.getClass(), "pd_id", 1585847225);
        setField(term3675, term3675.getClass(), "player_name", "IoAlmYsBwc");
        setField(term3675, term3675.getClass(), "lv_num", term3703);
        setField(term3675, term3675.getClass(), "lv_pnt", term3705);
        setField(term3675, term3675.getClass(), "lv_str", "TEParAifyi");
        setField(term3675, term3675.getClass(), "lv_efct_id", term3719);
        setField(term3675, term3675.getClass(), "lv_plt_id", term3721);
        setField(term3675, term3675.getClass(), "vcld_pts", term3723);
        setField(term3675, term3675.getClass(), "passwd_stat", enum12);
        setField(term3675, term3675.getClass(), "cmd", "OWDIEULEFu");
        setField(term3675, term3675.getClass(), "req_id", "dWRymuLBtr");
        setField(term3675, term3675.getClass(), "stat", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChg_name_price", argTypes, term3675, args);
    }

};


