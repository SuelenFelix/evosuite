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

public class ProfileResp_setHighestRating_100721973536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97952;
     Object term97991;

    public ProfileResp_setHighestRating_100721973536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97952 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97952, term97952.getClass(), "userName", "elULqOCaCg");
        setIntField(term97952, term97952.getClass(), "level", -1243668793);
        setLongField(term97952, term97952.getClass(), "exp", -4091679009787304302L);
        setLongField(term97952, term97952.getClass(), "point", -8945295960188420005L);
        setLongField(term97952, term97952.getClass(), "totalPoint", -5953362533731116176L);
        setIntField(term97952, term97952.getClass(), "playCount", -1856986214);
        setIntField(term97952, term97952.getClass(), "jewelCount", 862975892);
        setIntField(term97952, term97952.getClass(), "totalJewelCount", -1047267490);
        setIntField(term97952, term97952.getClass(), "playerRating", -582915442);
        setIntField(term97952, term97952.getClass(), "highestRating", -420425111);
        setIntField(term97952, term97952.getClass(), "battlePoint", -2104355252);
        setIntField(term97952, term97952.getClass(), "nameplateId", 793731767);
        setIntField(term97952, term97952.getClass(), "trophyId", -1302844902);
        setIntField(term97952, term97952.getClass(), "cardId", -1092897164);
        setIntField(term97952, term97952.getClass(), "characterId", 100050684);
        setLongField(term97952, term97952.getClass(), "sumTechHighScore", -2714236923061647943L);
        setLongField(term97952, term97952.getClass(), "sumTechBasicHighScore", -7142980066972309692L);
        setLongField(term97952, term97952.getClass(), "sumTechAdvancedHighScore", 252956363843220481L);
        setLongField(term97952, term97952.getClass(), "sumTechExpertHighScore", -4543821661885369887L);
        setLongField(term97952, term97952.getClass(), "sumTechMasterHighScore", -6412638974259573918L);
        setLongField(term97952, term97952.getClass(), "sumTechLunaticHighScore", -1434316050735076219L);
        setLongField(term97952, term97952.getClass(), "sumBattleHighScore", -5375722573779961660L);
        setLongField(term97952, term97952.getClass(), "sumBattleBasicHighScore", -6304168127691353469L);
        setLongField(term97952, term97952.getClass(), "sumBattleAdvancedHighScore", -4319775030389096180L);
        setLongField(term97952, term97952.getClass(), "sumBattleExpertHighScore", 8440135551086448673L);
        setLongField(term97952, term97952.getClass(), "sumBattleMasterHighScore", -1672229233068843874L);
        setLongField(term97952, term97952.getClass(), "sumBattleLunaticHighScore", 3159179241617765315L);
        term97991 = new Integer(401625801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97991;
        callMethod(klass, "setHighestRating", argTypes, term97952, args);
    }

};


