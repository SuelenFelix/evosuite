package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChangeNameRequest_getPlayername_5502266321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30704;

    public ChangeNameRequest_getPlayername_5502266321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30704 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        setField(term30704, term30704.getClass(), "a_code", null);
        setIntField(term30704, term30704.getClass(), "aime_id", 0);
        setField(term30704, term30704.getClass(), "aime_a_code", null);
        setIntField(term30704, term30704.getClass(), "pd_id", 0);
        setIntField(term30704, term30704.getClass(), "accept_idx", 0);
        setField(term30704, term30704.getClass(), "player_name", null);
        setIntField(term30704, term30704.getClass(), "chg_name_price", 0);
        setField(term30704, term30704.getClass(), "cmd", null);
        setField(term30704, term30704.getClass(), "req_id", null);
        setField(term30704, term30704.getClass(), "game_id", null);
        setField(term30704, term30704.getClass(), "r_ver", null);
        setField(term30704, term30704.getClass(), "kc_serial", null);
        setField(term30704, term30704.getClass(), "b_serial", null);
        setField(term30704, term30704.getClass(), "place_id", null);
        setField(term30704, term30704.getClass(), "time_stamp", null);
        setField(term30704, term30704.getClass(), "start_up_mode", null);
        setField(term30704, term30704.getClass(), "cmm_dly_mod", null);
        setField(term30704, term30704.getClass(), "cmm_dly_sec", null);
        setField(term30704, term30704.getClass(), "cmm_err_mod", null);
        setField(term30704, term30704.getClass(), "country_code", null);
        setField(term30704, term30704.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_name", argTypes, term30704, args);
    }

};


