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

public class CardProcedureResponse_getLvstr_278222035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19311;

    public CardProcedureResponse_getLvstr_278222035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19311 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term19311, term19311.getClass(), "cd_adm_result", null);
        setIntField(term19311, term19311.getClass(), "chg_name_price", 0);
        setIntField(term19311, term19311.getClass(), "accept_idx", 0);
        setIntField(term19311, term19311.getClass(), "pd_id", 0);
        setField(term19311, term19311.getClass(), "player_name", null);
        setField(term19311, term19311.getClass(), "lv_num", null);
        setField(term19311, term19311.getClass(), "lv_pnt", null);
        setField(term19311, term19311.getClass(), "lv_str", null);
        setField(term19311, term19311.getClass(), "lv_efct_id", null);
        setField(term19311, term19311.getClass(), "lv_plt_id", null);
        setField(term19311, term19311.getClass(), "vcld_pts", null);
        setField(term19311, term19311.getClass(), "passwd_stat", null);
        setField(term19311, term19311.getClass(), "cmd", null);
        setField(term19311, term19311.getClass(), "req_id", null);
        setField(term19311, term19311.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_str", argTypes, term19311, args);
    }

};


