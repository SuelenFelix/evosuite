package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getLastUsedDeckId_102700856656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118326;

    public ExternalUserData_getLastUsedDeckId_102700856656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118326 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term118326, term118326.getClass(), "accessCode", "KIdvMWgZnq");
        setField(term118326, term118326.getClass(), "userName", "bTvIVpaCAE");
        setIntField(term118326, term118326.getClass(), "level", -1731674101);
        setIntField(term118326, term118326.getClass(), "reincarnationNum", -1542310834);
        setLongField(term118326, term118326.getClass(), "exp", -3134609510921007024L);
        setLongField(term118326, term118326.getClass(), "point", 7369890448384182401L);
        setLongField(term118326, term118326.getClass(), "totalPoint", 8347323031636290088L);
        setIntField(term118326, term118326.getClass(), "playCount", 818775208);
        setIntField(term118326, term118326.getClass(), "jewelCount", -597230311);
        setIntField(term118326, term118326.getClass(), "totalJewelCount", 706684930);
        setIntField(term118326, term118326.getClass(), "medalCount", 689600308);
        setIntField(term118326, term118326.getClass(), "playerRating", -399148497);
        setIntField(term118326, term118326.getClass(), "highestRating", -1202481698);
        setIntField(term118326, term118326.getClass(), "battlePoint", -1191335989);
        setIntField(term118326, term118326.getClass(), "bestBattlePoint", 1034791152);
        setIntField(term118326, term118326.getClass(), "overDamageBattlePoint", 901676942);
        setIntField(term118326, term118326.getClass(), "nameplateId", 242726967);
        setIntField(term118326, term118326.getClass(), "trophyId", -1597183556);
        setIntField(term118326, term118326.getClass(), "cardId", 292425247);
        setIntField(term118326, term118326.getClass(), "characterId", 1542933401);
        setIntField(term118326, term118326.getClass(), "tabSetting", -78961447);
        setIntField(term118326, term118326.getClass(), "tabSortSetting", -611335870);
        setIntField(term118326, term118326.getClass(), "cardCategorySetting", 107492400);
        setIntField(term118326, term118326.getClass(), "cardSortSetting", 643588761);
        setIntField(term118326, term118326.getClass(), "rivalScoreCategorySetting", 1206762395);
        setIntField(term118326, term118326.getClass(), "playedTutorialBit", 917552169);
        setIntField(term118326, term118326.getClass(), "firstTutorialCancelNum", -1077091495);
        setLongField(term118326, term118326.getClass(), "sumTechHighScore", -8657409081910158759L);
        setLongField(term118326, term118326.getClass(), "sumTechBasicHighScore", 1184786260704907718L);
        setLongField(term118326, term118326.getClass(), "sumTechAdvancedHighScore", 3286449977075100074L);
        setLongField(term118326, term118326.getClass(), "sumTechExpertHighScore", 5975353931369383511L);
        setLongField(term118326, term118326.getClass(), "sumTechMasterHighScore", -534239435021672582L);
        setLongField(term118326, term118326.getClass(), "sumTechLunaticHighScore", 5255853078398502544L);
        setLongField(term118326, term118326.getClass(), "sumBattleHighScore", 2738829194305734189L);
        setLongField(term118326, term118326.getClass(), "sumBattleBasicHighScore", -8096980405317281549L);
        setLongField(term118326, term118326.getClass(), "sumBattleAdvancedHighScore", 5938062867488101746L);
        setLongField(term118326, term118326.getClass(), "sumBattleExpertHighScore", 1358556891212092497L);
        setLongField(term118326, term118326.getClass(), "sumBattleMasterHighScore", 2197622562977519712L);
        setLongField(term118326, term118326.getClass(), "sumBattleLunaticHighScore", 2294215595274775695L);
        setField(term118326, term118326.getClass(), "eventWatchedDate", "BYpnMgjxlu");
        setField(term118326, term118326.getClass(), "cmEventWatchedDate", "gKfOkZqrMd");
        setField(term118326, term118326.getClass(), "firstGameId", "DImkJyxGWZ");
        setField(term118326, term118326.getClass(), "firstRomVersion", "bKBkrLKYMu");
        setField(term118326, term118326.getClass(), "firstDataVersion", "VlUvXnMgqc");
        setField(term118326, term118326.getClass(), "firstPlayDate", "NRPHYXTCBM");
        setField(term118326, term118326.getClass(), "lastGameId", "PdVjteDxhm");
        setField(term118326, term118326.getClass(), "lastRomVersion", "jHVCXECbOs");
        setField(term118326, term118326.getClass(), "lastDataVersion", "nEhDjFYvXB");
        setField(term118326, term118326.getClass(), "compatibleCmVersion", "DgWKryqKJD");
        setField(term118326, term118326.getClass(), "lastPlayDate", "wqWIipIhFm");
        setIntField(term118326, term118326.getClass(), "lastPlaceId", -489336021);
        setField(term118326, term118326.getClass(), "lastPlaceName", "FcfoqdQMbR");
        setIntField(term118326, term118326.getClass(), "lastRegionId", 56574097);
        setField(term118326, term118326.getClass(), "lastRegionName", "ySejCRlcyX");
        setIntField(term118326, term118326.getClass(), "lastAllNetId", -1321139175);
        setField(term118326, term118326.getClass(), "lastClientId", "yrQgyYtARK");
        setIntField(term118326, term118326.getClass(), "lastUsedDeckId", 520338382);
        setIntField(term118326, term118326.getClass(), "lastPlayMusicLevel", -540123800);
        setIntField(term118326, term118326.getClass(), "lastEmoneyBrand", -1933189543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUsedDeckId", argTypes, term118326, args);
    }

};


