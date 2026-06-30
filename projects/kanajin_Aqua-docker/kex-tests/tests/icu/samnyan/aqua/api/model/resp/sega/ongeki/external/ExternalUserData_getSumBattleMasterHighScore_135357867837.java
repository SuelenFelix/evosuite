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

public class ExternalUserData_getSumBattleMasterHighScore_135357867837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110802;

    public ExternalUserData_getSumBattleMasterHighScore_135357867837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110802 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term110802, term110802.getClass(), "accessCode", "plIOkAiMwJ");
        setField(term110802, term110802.getClass(), "userName", "TsesWAlesh");
        setIntField(term110802, term110802.getClass(), "level", -2135665058);
        setIntField(term110802, term110802.getClass(), "reincarnationNum", 396626068);
        setLongField(term110802, term110802.getClass(), "exp", 8440135551086448673L);
        setLongField(term110802, term110802.getClass(), "point", -1672229233068843874L);
        setLongField(term110802, term110802.getClass(), "totalPoint", 3159179241617765315L);
        setIntField(term110802, term110802.getClass(), "playCount", 599277247);
        setIntField(term110802, term110802.getClass(), "jewelCount", 1786966477);
        setIntField(term110802, term110802.getClass(), "totalJewelCount", -1225644444);
        setIntField(term110802, term110802.getClass(), "medalCount", 57536958);
        setIntField(term110802, term110802.getClass(), "playerRating", -618691888);
        setIntField(term110802, term110802.getClass(), "highestRating", 984601041);
        setIntField(term110802, term110802.getClass(), "battlePoint", 2113507069);
        setIntField(term110802, term110802.getClass(), "bestBattlePoint", -1512734741);
        setIntField(term110802, term110802.getClass(), "overDamageBattlePoint", -1948930286);
        setIntField(term110802, term110802.getClass(), "nameplateId", 1589457025);
        setIntField(term110802, term110802.getClass(), "trophyId", 653225506);
        setIntField(term110802, term110802.getClass(), "cardId", 1653353603);
        setIntField(term110802, term110802.getClass(), "characterId", 1755775898);
        setIntField(term110802, term110802.getClass(), "tabSetting", -187208798);
        setIntField(term110802, term110802.getClass(), "tabSortSetting", -1682412978);
        setIntField(term110802, term110802.getClass(), "cardCategorySetting", -1099062595);
        setIntField(term110802, term110802.getClass(), "cardSortSetting", -143251138);
        setIntField(term110802, term110802.getClass(), "rivalScoreCategorySetting", 1756587898);
        setIntField(term110802, term110802.getClass(), "playedTutorialBit", -958820728);
        setIntField(term110802, term110802.getClass(), "firstTutorialCancelNum", -1303526060);
        setLongField(term110802, term110802.getClass(), "sumTechHighScore", -1618481608996124894L);
        setLongField(term110802, term110802.getClass(), "sumTechBasicHighScore", -7044858981045809848L);
        setLongField(term110802, term110802.getClass(), "sumTechAdvancedHighScore", -2399581411225761909L);
        setLongField(term110802, term110802.getClass(), "sumTechExpertHighScore", 6838360539524603827L);
        setLongField(term110802, term110802.getClass(), "sumTechMasterHighScore", 3645049769064707157L);
        setLongField(term110802, term110802.getClass(), "sumTechLunaticHighScore", -5403608159440697074L);
        setLongField(term110802, term110802.getClass(), "sumBattleHighScore", -1325819407199766515L);
        setLongField(term110802, term110802.getClass(), "sumBattleBasicHighScore", 6448648790433973386L);
        setLongField(term110802, term110802.getClass(), "sumBattleAdvancedHighScore", -8369210930627405290L);
        setLongField(term110802, term110802.getClass(), "sumBattleExpertHighScore", -3991405205763855637L);
        setLongField(term110802, term110802.getClass(), "sumBattleMasterHighScore", -3582519144397090903L);
        setLongField(term110802, term110802.getClass(), "sumBattleLunaticHighScore", 5365457211091588386L);
        setField(term110802, term110802.getClass(), "eventWatchedDate", "IPdUbaiIeB");
        setField(term110802, term110802.getClass(), "cmEventWatchedDate", "WoGLhyxdfV");
        setField(term110802, term110802.getClass(), "firstGameId", "NAeoJYQffb");
        setField(term110802, term110802.getClass(), "firstRomVersion", "frmOeQcldO");
        setField(term110802, term110802.getClass(), "firstDataVersion", "EXCyrcgGgy");
        setField(term110802, term110802.getClass(), "firstPlayDate", "BoePrBiFDx");
        setField(term110802, term110802.getClass(), "lastGameId", "nqSnHrlKXP");
        setField(term110802, term110802.getClass(), "lastRomVersion", "VMOQdMfgYP");
        setField(term110802, term110802.getClass(), "lastDataVersion", "pwrnkLXEmX");
        setField(term110802, term110802.getClass(), "compatibleCmVersion", "nMcZZSwFPs");
        setField(term110802, term110802.getClass(), "lastPlayDate", "UiaFhnPuSw");
        setIntField(term110802, term110802.getClass(), "lastPlaceId", -1007397070);
        setField(term110802, term110802.getClass(), "lastPlaceName", "etXsYIibxg");
        setIntField(term110802, term110802.getClass(), "lastRegionId", -386404955);
        setField(term110802, term110802.getClass(), "lastRegionName", "hxQyeuzPhS");
        setIntField(term110802, term110802.getClass(), "lastAllNetId", 2146968224);
        setField(term110802, term110802.getClass(), "lastClientId", "uskUHJhOco");
        setIntField(term110802, term110802.getClass(), "lastUsedDeckId", -1882924167);
        setIntField(term110802, term110802.getClass(), "lastPlayMusicLevel", 1208200949);
        setIntField(term110802, term110802.getClass(), "lastEmoneyBrand", 635282728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleMasterHighScore", argTypes, term110802, args);
    }

};


