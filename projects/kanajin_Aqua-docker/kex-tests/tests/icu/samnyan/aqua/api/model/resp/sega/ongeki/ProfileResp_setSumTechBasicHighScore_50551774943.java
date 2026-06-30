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
import java.lang.Long;

public class ProfileResp_setSumTechBasicHighScore_50551774943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98309;
     Object term98348;

    public ProfileResp_setSumTechBasicHighScore_50551774943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98309 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98309, term98309.getClass(), "userName", "tMGOlywCNF");
        setIntField(term98309, term98309.getClass(), "level", -853384035);
        setLongField(term98309, term98309.getClass(), "exp", -2312069257754675718L);
        setLongField(term98309, term98309.getClass(), "point", -3050613874514953293L);
        setLongField(term98309, term98309.getClass(), "totalPoint", -6514613926623974211L);
        setIntField(term98309, term98309.getClass(), "playCount", -1758521405);
        setIntField(term98309, term98309.getClass(), "jewelCount", 832472611);
        setIntField(term98309, term98309.getClass(), "totalJewelCount", -990180678);
        setIntField(term98309, term98309.getClass(), "playerRating", -1908769601);
        setIntField(term98309, term98309.getClass(), "highestRating", 17594830);
        setIntField(term98309, term98309.getClass(), "battlePoint", -66779045);
        setIntField(term98309, term98309.getClass(), "nameplateId", 1915262943);
        setIntField(term98309, term98309.getClass(), "trophyId", 911273351);
        setIntField(term98309, term98309.getClass(), "cardId", 1669471575);
        setIntField(term98309, term98309.getClass(), "characterId", 1152840787);
        setLongField(term98309, term98309.getClass(), "sumTechHighScore", 2183188154740503738L);
        setLongField(term98309, term98309.getClass(), "sumTechBasicHighScore", -451607477374993472L);
        setLongField(term98309, term98309.getClass(), "sumTechAdvancedHighScore", 2840755355585115935L);
        setLongField(term98309, term98309.getClass(), "sumTechExpertHighScore", -5716496558005575185L);
        setLongField(term98309, term98309.getClass(), "sumTechMasterHighScore", 3876149023053286847L);
        setLongField(term98309, term98309.getClass(), "sumTechLunaticHighScore", -5733112360762657255L);
        setLongField(term98309, term98309.getClass(), "sumBattleHighScore", -3094489110597065278L);
        setLongField(term98309, term98309.getClass(), "sumBattleBasicHighScore", 3629680404122589907L);
        setLongField(term98309, term98309.getClass(), "sumBattleAdvancedHighScore", -600026769415209181L);
        setLongField(term98309, term98309.getClass(), "sumBattleExpertHighScore", 945049753895570588L);
        setLongField(term98309, term98309.getClass(), "sumBattleMasterHighScore", 3291597327489638767L);
        setLongField(term98309, term98309.getClass(), "sumBattleLunaticHighScore", -2413931516820820415L);
        term98348 = new Long(-756835273781061428L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98348;
        callMethod(klass, "setSumTechBasicHighScore", argTypes, term98309, args);
    }

};


