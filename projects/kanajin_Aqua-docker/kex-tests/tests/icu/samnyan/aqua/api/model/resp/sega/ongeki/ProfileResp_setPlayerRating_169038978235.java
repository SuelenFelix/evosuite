package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ProfileResp_setPlayerRating_169038978235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97901;
     Object term97940;

    public ProfileResp_setPlayerRating_169038978235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97901 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97901, term97901.getClass(), "userName", "OwqAVeoEmD");
        setIntField(term97901, term97901.getClass(), "level", 1595968492);
        setLongField(term97901, term97901.getClass(), "exp", 6937552757235439613L);
        setLongField(term97901, term97901.getClass(), "point", 354188091531442782L);
        setLongField(term97901, term97901.getClass(), "totalPoint", 6115081060986828305L);
        setIntField(term97901, term97901.getClass(), "playCount", 1697207144);
        setIntField(term97901, term97901.getClass(), "jewelCount", 763597991);
        setIntField(term97901, term97901.getClass(), "totalJewelCount", 173258285);
        setIntField(term97901, term97901.getClass(), "playerRating", 158170344);
        setIntField(term97901, term97901.getClass(), "highestRating", -1175478574);
        setIntField(term97901, term97901.getClass(), "battlePoint", -1717508219);
        setIntField(term97901, term97901.getClass(), "nameplateId", 1666697);
        setIntField(term97901, term97901.getClass(), "trophyId", -853854553);
        setIntField(term97901, term97901.getClass(), "cardId", -799969894);
        setIntField(term97901, term97901.getClass(), "characterId", 2067721111);
        setLongField(term97901, term97901.getClass(), "sumTechHighScore", 2221541506205302838L);
        setLongField(term97901, term97901.getClass(), "sumTechBasicHighScore", 9043436389025812505L);
        setLongField(term97901, term97901.getClass(), "sumTechAdvancedHighScore", 6503123965916922124L);
        setLongField(term97901, term97901.getClass(), "sumTechExpertHighScore", 6327725821083721747L);
        setLongField(term97901, term97901.getClass(), "sumTechMasterHighScore", -5582518474242199651L);
        setLongField(term97901, term97901.getClass(), "sumTechLunaticHighScore", 6342518740270947222L);
        setLongField(term97901, term97901.getClass(), "sumBattleHighScore", 6463032031400501913L);
        setLongField(term97901, term97901.getClass(), "sumBattleBasicHighScore", 2549967421376425235L);
        setLongField(term97901, term97901.getClass(), "sumBattleAdvancedHighScore", -6098413057181517434L);
        setLongField(term97901, term97901.getClass(), "sumBattleExpertHighScore", -5686652191625724579L);
        setLongField(term97901, term97901.getClass(), "sumBattleMasterHighScore", 1340091358565624805L);
        setLongField(term97901, term97901.getClass(), "sumBattleLunaticHighScore", 6941396573792375146L);
        term97940 = new Integer(405142057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97940;
        callMethod(klass, "setPlayerRating", argTypes, term97901, args);
    }

};


