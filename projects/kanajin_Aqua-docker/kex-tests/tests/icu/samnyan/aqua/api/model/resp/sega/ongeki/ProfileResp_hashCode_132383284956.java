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

public class ProfileResp_hashCode_132383284956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98970;

    public ProfileResp_hashCode_132383284956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98970 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98970, term98970.getClass(), "userName", "seVCegEoTl");
        setIntField(term98970, term98970.getClass(), "level", -391187273);
        setLongField(term98970, term98970.getClass(), "exp", -6722720131967168037L);
        setLongField(term98970, term98970.getClass(), "point", 5530179165032073132L);
        setLongField(term98970, term98970.getClass(), "totalPoint", 7305696443956691772L);
        setIntField(term98970, term98970.getClass(), "playCount", -449124197);
        setIntField(term98970, term98970.getClass(), "jewelCount", 1959567185);
        setIntField(term98970, term98970.getClass(), "totalJewelCount", -958801237);
        setIntField(term98970, term98970.getClass(), "playerRating", -16385615);
        setIntField(term98970, term98970.getClass(), "highestRating", 2042834802);
        setIntField(term98970, term98970.getClass(), "battlePoint", 1546690797);
        setIntField(term98970, term98970.getClass(), "nameplateId", -1989871996);
        setIntField(term98970, term98970.getClass(), "trophyId", -1891270840);
        setIntField(term98970, term98970.getClass(), "cardId", 734153645);
        setIntField(term98970, term98970.getClass(), "characterId", -828144813);
        setLongField(term98970, term98970.getClass(), "sumTechHighScore", 7711406235394105090L);
        setLongField(term98970, term98970.getClass(), "sumTechBasicHighScore", -4103673992358233807L);
        setLongField(term98970, term98970.getClass(), "sumTechAdvancedHighScore", 3030664385650897099L);
        setLongField(term98970, term98970.getClass(), "sumTechExpertHighScore", -7343913825919302944L);
        setLongField(term98970, term98970.getClass(), "sumTechMasterHighScore", 6321953648988079590L);
        setLongField(term98970, term98970.getClass(), "sumTechLunaticHighScore", 6951367892125054802L);
        setLongField(term98970, term98970.getClass(), "sumBattleHighScore", 9050947857219555291L);
        setLongField(term98970, term98970.getClass(), "sumBattleBasicHighScore", -6602480154871714545L);
        setLongField(term98970, term98970.getClass(), "sumBattleAdvancedHighScore", 8808163510126535452L);
        setLongField(term98970, term98970.getClass(), "sumBattleExpertHighScore", 4032848657759062020L);
        setLongField(term98970, term98970.getClass(), "sumBattleMasterHighScore", 4485606855777374605L);
        setLongField(term98970, term98970.getClass(), "sumBattleLunaticHighScore", 4077943884188156333L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term98970, args);
    }

};


