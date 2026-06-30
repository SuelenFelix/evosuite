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

public class ProfileResp_getSumBattleExpertHighScore_3277146924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97326;

    public ProfileResp_getSumBattleExpertHighScore_3277146924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97326 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97326, term97326.getClass(), "userName", "aMGJklsoLZ");
        setIntField(term97326, term97326.getClass(), "level", -369424020);
        setLongField(term97326, term97326.getClass(), "exp", -952331592427196322L);
        setLongField(term97326, term97326.getClass(), "point", 8332714523188286829L);
        setLongField(term97326, term97326.getClass(), "totalPoint", -7050364774011155163L);
        setIntField(term97326, term97326.getClass(), "playCount", -2144300985);
        setIntField(term97326, term97326.getClass(), "jewelCount", 1677691092);
        setIntField(term97326, term97326.getClass(), "totalJewelCount", 1593680464);
        setIntField(term97326, term97326.getClass(), "playerRating", -1360836324);
        setIntField(term97326, term97326.getClass(), "highestRating", 2121157829);
        setIntField(term97326, term97326.getClass(), "battlePoint", 191437037);
        setIntField(term97326, term97326.getClass(), "nameplateId", 490289944);
        setIntField(term97326, term97326.getClass(), "trophyId", -1312271606);
        setIntField(term97326, term97326.getClass(), "cardId", 855397818);
        setIntField(term97326, term97326.getClass(), "characterId", 1258827879);
        setLongField(term97326, term97326.getClass(), "sumTechHighScore", 6051904037637991823L);
        setLongField(term97326, term97326.getClass(), "sumTechBasicHighScore", -4929381496491547272L);
        setLongField(term97326, term97326.getClass(), "sumTechAdvancedHighScore", -4210446682323302406L);
        setLongField(term97326, term97326.getClass(), "sumTechExpertHighScore", -9092508146526919000L);
        setLongField(term97326, term97326.getClass(), "sumTechMasterHighScore", 6550193599493284471L);
        setLongField(term97326, term97326.getClass(), "sumTechLunaticHighScore", -3090971409190339633L);
        setLongField(term97326, term97326.getClass(), "sumBattleHighScore", -1264000902914726799L);
        setLongField(term97326, term97326.getClass(), "sumBattleBasicHighScore", -3351783153033446895L);
        setLongField(term97326, term97326.getClass(), "sumBattleAdvancedHighScore", -7809136736018829608L);
        setLongField(term97326, term97326.getClass(), "sumBattleExpertHighScore", 4276672231842319653L);
        setLongField(term97326, term97326.getClass(), "sumBattleMasterHighScore", 8036845243966637640L);
        setLongField(term97326, term97326.getClass(), "sumBattleLunaticHighScore", -4584073394624976877L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleExpertHighScore", argTypes, term97326, args);
    }

};


