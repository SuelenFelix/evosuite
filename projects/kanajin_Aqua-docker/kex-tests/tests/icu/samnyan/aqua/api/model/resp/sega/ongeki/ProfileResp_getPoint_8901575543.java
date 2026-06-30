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

public class ProfileResp_getPoint_8901575543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96297;

    public ProfileResp_getPoint_8901575543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96297 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96297, term96297.getClass(), "userName", "VeGuwdeHJz");
        setIntField(term96297, term96297.getClass(), "level", -34944818);
        setLongField(term96297, term96297.getClass(), "exp", -3209352479065960673L);
        setLongField(term96297, term96297.getClass(), "point", -3840690306268752613L);
        setLongField(term96297, term96297.getClass(), "totalPoint", 2627936013395114275L);
        setIntField(term96297, term96297.getClass(), "playCount", -114452235);
        setIntField(term96297, term96297.getClass(), "jewelCount", 493987245);
        setIntField(term96297, term96297.getClass(), "totalJewelCount", 7093260);
        setIntField(term96297, term96297.getClass(), "playerRating", 1552297074);
        setIntField(term96297, term96297.getClass(), "highestRating", 850055216);
        setIntField(term96297, term96297.getClass(), "battlePoint", -339076690);
        setIntField(term96297, term96297.getClass(), "nameplateId", -1368411455);
        setIntField(term96297, term96297.getClass(), "trophyId", -560818001);
        setIntField(term96297, term96297.getClass(), "cardId", -1321313572);
        setIntField(term96297, term96297.getClass(), "characterId", -344179756);
        setLongField(term96297, term96297.getClass(), "sumTechHighScore", -7299236273441286295L);
        setLongField(term96297, term96297.getClass(), "sumTechBasicHighScore", -4436219573642982325L);
        setLongField(term96297, term96297.getClass(), "sumTechAdvancedHighScore", 6378572342484772532L);
        setLongField(term96297, term96297.getClass(), "sumTechExpertHighScore", -8244560538480267683L);
        setLongField(term96297, term96297.getClass(), "sumTechMasterHighScore", 138599279036226378L);
        setLongField(term96297, term96297.getClass(), "sumTechLunaticHighScore", 6263492991884156493L);
        setLongField(term96297, term96297.getClass(), "sumBattleHighScore", -5332451274305092019L);
        setLongField(term96297, term96297.getClass(), "sumBattleBasicHighScore", -9204842257916119907L);
        setLongField(term96297, term96297.getClass(), "sumBattleAdvancedHighScore", 6375094005803844278L);
        setLongField(term96297, term96297.getClass(), "sumBattleExpertHighScore", 5465128087796450816L);
        setLongField(term96297, term96297.getClass(), "sumBattleMasterHighScore", -1407875883056016741L);
        setLongField(term96297, term96297.getClass(), "sumBattleLunaticHighScore", 8718220311942745153L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term96297, args);
    }

};


