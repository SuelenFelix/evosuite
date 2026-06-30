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

public class ProfileResp_getLevel_4197665581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96199;

    public ProfileResp_getLevel_4197665581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96199 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96199, term96199.getClass(), "userName", "gjMvDNCdsK");
        setIntField(term96199, term96199.getClass(), "level", 724343476);
        setLongField(term96199, term96199.getClass(), "exp", -6247957055809397740L);
        setLongField(term96199, term96199.getClass(), "point", -6648704301740000097L);
        setLongField(term96199, term96199.getClass(), "totalPoint", -8934533886895484071L);
        setIntField(term96199, term96199.getClass(), "playCount", -1747342749);
        setIntField(term96199, term96199.getClass(), "jewelCount", -352111128);
        setIntField(term96199, term96199.getClass(), "totalJewelCount", -1326815249);
        setIntField(term96199, term96199.getClass(), "playerRating", 169499354);
        setIntField(term96199, term96199.getClass(), "highestRating", -1619038177);
        setIntField(term96199, term96199.getClass(), "battlePoint", 1189021686);
        setIntField(term96199, term96199.getClass(), "nameplateId", 1253477645);
        setIntField(term96199, term96199.getClass(), "trophyId", 1220582239);
        setIntField(term96199, term96199.getClass(), "cardId", -635855862);
        setIntField(term96199, term96199.getClass(), "characterId", -1373883790);
        setLongField(term96199, term96199.getClass(), "sumTechHighScore", -4908487413092383372L);
        setLongField(term96199, term96199.getClass(), "sumTechBasicHighScore", 177219061216457769L);
        setLongField(term96199, term96199.getClass(), "sumTechAdvancedHighScore", 4332808466795568282L);
        setLongField(term96199, term96199.getClass(), "sumTechExpertHighScore", -4944925423698874446L);
        setLongField(term96199, term96199.getClass(), "sumTechMasterHighScore", -6400720071664745009L);
        setLongField(term96199, term96199.getClass(), "sumTechLunaticHighScore", -3998241159702464397L);
        setLongField(term96199, term96199.getClass(), "sumBattleHighScore", 8535075473882209383L);
        setLongField(term96199, term96199.getClass(), "sumBattleBasicHighScore", 8745247182838849755L);
        setLongField(term96199, term96199.getClass(), "sumBattleAdvancedHighScore", 1051487121679551637L);
        setLongField(term96199, term96199.getClass(), "sumBattleExpertHighScore", -7502389603229532112L);
        setLongField(term96199, term96199.getClass(), "sumBattleMasterHighScore", -9109424427608859411L);
        setLongField(term96199, term96199.getClass(), "sumBattleLunaticHighScore", 8524092659982713266L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term96199, args);
    }

};


