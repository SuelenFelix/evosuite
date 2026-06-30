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

public class ProfileResp_setCharacterId_196732686841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98207;
     Object term98246;

    public ProfileResp_setCharacterId_196732686841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98207 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98207, term98207.getClass(), "userName", "BOLQzJFvBT");
        setIntField(term98207, term98207.getClass(), "level", -604910187);
        setLongField(term98207, term98207.getClass(), "exp", -8796965023246191952L);
        setLongField(term98207, term98207.getClass(), "point", 7146866325263763663L);
        setLongField(term98207, term98207.getClass(), "totalPoint", -2840005887862287668L);
        setIntField(term98207, term98207.getClass(), "playCount", 1648083419);
        setIntField(term98207, term98207.getClass(), "jewelCount", -1418226353);
        setIntField(term98207, term98207.getClass(), "totalJewelCount", -1741475581);
        setIntField(term98207, term98207.getClass(), "playerRating", 1728453689);
        setIntField(term98207, term98207.getClass(), "highestRating", 1928363637);
        setIntField(term98207, term98207.getClass(), "battlePoint", -1121758298);
        setIntField(term98207, term98207.getClass(), "nameplateId", -945758276);
        setIntField(term98207, term98207.getClass(), "trophyId", -1375825300);
        setIntField(term98207, term98207.getClass(), "cardId", 1032138158);
        setIntField(term98207, term98207.getClass(), "characterId", -109274141);
        setLongField(term98207, term98207.getClass(), "sumTechHighScore", 7909964535341297656L);
        setLongField(term98207, term98207.getClass(), "sumTechBasicHighScore", 1502897996915587896L);
        setLongField(term98207, term98207.getClass(), "sumTechAdvancedHighScore", 5807078452178071797L);
        setLongField(term98207, term98207.getClass(), "sumTechExpertHighScore", 8993016582371171372L);
        setLongField(term98207, term98207.getClass(), "sumTechMasterHighScore", 282420200720715089L);
        setLongField(term98207, term98207.getClass(), "sumTechLunaticHighScore", -8137183670134160915L);
        setLongField(term98207, term98207.getClass(), "sumBattleHighScore", -7361022332795272676L);
        setLongField(term98207, term98207.getClass(), "sumBattleBasicHighScore", 3571534492929139026L);
        setLongField(term98207, term98207.getClass(), "sumBattleAdvancedHighScore", 1768510726246994451L);
        setLongField(term98207, term98207.getClass(), "sumBattleExpertHighScore", 6333121401704736899L);
        setLongField(term98207, term98207.getClass(), "sumBattleMasterHighScore", 193183519240064509L);
        setLongField(term98207, term98207.getClass(), "sumBattleLunaticHighScore", -3521302381002188796L);
        term98246 = new Integer(-1828022907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term98246;
        callMethod(klass, "setCharacterId", argTypes, term98207, args);
    }

};


