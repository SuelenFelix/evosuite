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

public class ProfileResp_setSumBattleMasterHighScore_135296232752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98768;
     Object term98807;

    public ProfileResp_setSumBattleMasterHighScore_135296232752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98768 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98768, term98768.getClass(), "userName", "vsXOcxpXzo");
        setIntField(term98768, term98768.getClass(), "level", -1660286082);
        setLongField(term98768, term98768.getClass(), "exp", -1846822394580187184L);
        setLongField(term98768, term98768.getClass(), "point", 7470149372052804970L);
        setLongField(term98768, term98768.getClass(), "totalPoint", 3854446282437601289L);
        setIntField(term98768, term98768.getClass(), "playCount", -678506009);
        setIntField(term98768, term98768.getClass(), "jewelCount", 1798065091);
        setIntField(term98768, term98768.getClass(), "totalJewelCount", 552715483);
        setIntField(term98768, term98768.getClass(), "playerRating", 1064843831);
        setIntField(term98768, term98768.getClass(), "highestRating", 1750934756);
        setIntField(term98768, term98768.getClass(), "battlePoint", 422394282);
        setIntField(term98768, term98768.getClass(), "nameplateId", -213529739);
        setIntField(term98768, term98768.getClass(), "trophyId", 2086055917);
        setIntField(term98768, term98768.getClass(), "cardId", -528132980);
        setIntField(term98768, term98768.getClass(), "characterId", 1963632434);
        setLongField(term98768, term98768.getClass(), "sumTechHighScore", 8565087322521317165L);
        setLongField(term98768, term98768.getClass(), "sumTechBasicHighScore", -3314866861999065002L);
        setLongField(term98768, term98768.getClass(), "sumTechAdvancedHighScore", 1846497971426121509L);
        setLongField(term98768, term98768.getClass(), "sumTechExpertHighScore", 4505057184263458227L);
        setLongField(term98768, term98768.getClass(), "sumTechMasterHighScore", -8568433449411339885L);
        setLongField(term98768, term98768.getClass(), "sumTechLunaticHighScore", -6804203069033733085L);
        setLongField(term98768, term98768.getClass(), "sumBattleHighScore", 5079513179886147872L);
        setLongField(term98768, term98768.getClass(), "sumBattleBasicHighScore", -5847331116152904564L);
        setLongField(term98768, term98768.getClass(), "sumBattleAdvancedHighScore", 635953914377265513L);
        setLongField(term98768, term98768.getClass(), "sumBattleExpertHighScore", -8898900260136590113L);
        setLongField(term98768, term98768.getClass(), "sumBattleMasterHighScore", 9120889159648845245L);
        setLongField(term98768, term98768.getClass(), "sumBattleLunaticHighScore", 7231121302151038587L);
        term98807 = new Long(-5049156697737365468L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98807;
        callMethod(klass, "setSumBattleMasterHighScore", argTypes, term98768, args);
    }

};


