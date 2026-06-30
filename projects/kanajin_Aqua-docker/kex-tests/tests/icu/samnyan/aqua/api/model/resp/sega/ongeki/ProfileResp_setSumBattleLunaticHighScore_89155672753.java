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

public class ProfileResp_setSumBattleLunaticHighScore_89155672753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98819;
     Object term98858;

    public ProfileResp_setSumBattleLunaticHighScore_89155672753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98819 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98819, term98819.getClass(), "userName", "BKsrnxcvwO");
        setIntField(term98819, term98819.getClass(), "level", -924051474);
        setLongField(term98819, term98819.getClass(), "exp", 5220991136779392723L);
        setLongField(term98819, term98819.getClass(), "point", -1196613288262458205L);
        setLongField(term98819, term98819.getClass(), "totalPoint", -4353243523900058035L);
        setIntField(term98819, term98819.getClass(), "playCount", -1288438220);
        setIntField(term98819, term98819.getClass(), "jewelCount", -1313294629);
        setIntField(term98819, term98819.getClass(), "totalJewelCount", -1777498660);
        setIntField(term98819, term98819.getClass(), "playerRating", 1332103525);
        setIntField(term98819, term98819.getClass(), "highestRating", 106282103);
        setIntField(term98819, term98819.getClass(), "battlePoint", -1365356851);
        setIntField(term98819, term98819.getClass(), "nameplateId", -1992119869);
        setIntField(term98819, term98819.getClass(), "trophyId", -1630275947);
        setIntField(term98819, term98819.getClass(), "cardId", 795575377);
        setIntField(term98819, term98819.getClass(), "characterId", -550783964);
        setLongField(term98819, term98819.getClass(), "sumTechHighScore", 7900596771603143871L);
        setLongField(term98819, term98819.getClass(), "sumTechBasicHighScore", -7727812548590909075L);
        setLongField(term98819, term98819.getClass(), "sumTechAdvancedHighScore", -7041400520007266498L);
        setLongField(term98819, term98819.getClass(), "sumTechExpertHighScore", 8056668597431253042L);
        setLongField(term98819, term98819.getClass(), "sumTechMasterHighScore", 4899158238784342068L);
        setLongField(term98819, term98819.getClass(), "sumTechLunaticHighScore", 1137091658310647744L);
        setLongField(term98819, term98819.getClass(), "sumBattleHighScore", -5771733709474376387L);
        setLongField(term98819, term98819.getClass(), "sumBattleBasicHighScore", -486319717648901570L);
        setLongField(term98819, term98819.getClass(), "sumBattleAdvancedHighScore", 548239283608218118L);
        setLongField(term98819, term98819.getClass(), "sumBattleExpertHighScore", -2393150017658519295L);
        setLongField(term98819, term98819.getClass(), "sumBattleMasterHighScore", -282949357886650094L);
        setLongField(term98819, term98819.getClass(), "sumBattleLunaticHighScore", 5675685642943024361L);
        term98858 = new Long(2388536828509795515L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98858;
        callMethod(klass, "setSumBattleLunaticHighScore", argTypes, term98819, args);
    }

};


