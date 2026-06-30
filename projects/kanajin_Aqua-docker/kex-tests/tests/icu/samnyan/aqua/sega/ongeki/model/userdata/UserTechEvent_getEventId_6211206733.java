package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserTechEvent_getEventId_6211206733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352474;

    public UserTechEvent_getEventId_6211206733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term352480 = new Long(-927624000067769617L);
        term352474 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term352476 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term352478 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term352494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term352495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term352499 = newInstance(Class.forName("java.time.LocalTime"));
        Object term352504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term352505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term352509 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term352474, term352474.getClass(), "id", 7141877579179556983L);
        setLongField(term352476, term352476.getClass(), "id", -1794858605035714471L);
        setLongField(term352478, term352478.getClass(), "id", 316786045416268066L);
        setField(term352478, term352478.getClass(), "extId", term352480);
        setField(term352478, term352478.getClass(), "luid", "RAFCyuphCQ");
        setIntField(term352495, term352495.getClass(), "year", 2012);
        setShortField(term352495, term352495.getClass(), "month", (short) 12);
        setShortField(term352495, term352495.getClass(), "day", (short) 12);
        setField(term352494, term352494.getClass(), "date", term352495);
        setByteField(term352499, term352499.getClass(), "hour", (byte) 17);
        setByteField(term352499, term352499.getClass(), "minute", (byte) 21);
        setByteField(term352499, term352499.getClass(), "second", (byte) 4);
        setIntField(term352499, term352499.getClass(), "nano", 716958293);
        setField(term352494, term352494.getClass(), "time", term352499);
        setField(term352478, term352478.getClass(), "registerTime", term352494);
        setIntField(term352505, term352505.getClass(), "year", 2019);
        setShortField(term352505, term352505.getClass(), "month", (short) 7);
        setShortField(term352505, term352505.getClass(), "day", (short) 17);
        setField(term352504, term352504.getClass(), "date", term352505);
        setByteField(term352509, term352509.getClass(), "hour", (byte) 5);
        setByteField(term352509, term352509.getClass(), "minute", (byte) 18);
        setByteField(term352509, term352509.getClass(), "second", (byte) 23);
        setIntField(term352509, term352509.getClass(), "nano", 754719734);
        setField(term352504, term352504.getClass(), "time", term352509);
        setField(term352478, term352478.getClass(), "accessTime", term352504);
        setField(term352476, term352476.getClass(), "card", term352478);
        setField(term352476, term352476.getClass(), "userName", "oVZRbSYRkm");
        setIntField(term352476, term352476.getClass(), "level", 124846463);
        setIntField(term352476, term352476.getClass(), "reincarnationNum", 1008565596);
        setLongField(term352476, term352476.getClass(), "exp", 6125799060333915293L);
        setLongField(term352476, term352476.getClass(), "point", -5182090434973355602L);
        setLongField(term352476, term352476.getClass(), "totalPoint", -502997334738774754L);
        setIntField(term352476, term352476.getClass(), "playCount", 343021166);
        setIntField(term352476, term352476.getClass(), "jewelCount", -586291975);
        setIntField(term352476, term352476.getClass(), "totalJewelCount", -469609443);
        setIntField(term352476, term352476.getClass(), "medalCount", -1988533642);
        setIntField(term352476, term352476.getClass(), "playerRating", 1018885776);
        setIntField(term352476, term352476.getClass(), "highestRating", -1965766209);
        setIntField(term352476, term352476.getClass(), "battlePoint", 1132537264);
        setIntField(term352476, term352476.getClass(), "bestBattlePoint", -1940330669);
        setIntField(term352476, term352476.getClass(), "overDamageBattlePoint", -992322962);
        setBooleanField(term352476, term352476.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term352476, term352476.getClass(), "nameplateId", -806566603);
        setIntField(term352476, term352476.getClass(), "trophyId", -1615268422);
        setIntField(term352476, term352476.getClass(), "cardId", -1183231317);
        setIntField(term352476, term352476.getClass(), "characterId", -2065164593);
        setIntField(term352476, term352476.getClass(), "characterVoiceNo", 439522316);
        setIntField(term352476, term352476.getClass(), "tabSetting", -1281277850);
        setIntField(term352476, term352476.getClass(), "tabSortSetting", -1698269899);
        setIntField(term352476, term352476.getClass(), "cardCategorySetting", 1019037899);
        setIntField(term352476, term352476.getClass(), "cardSortSetting", 687173717);
        setIntField(term352476, term352476.getClass(), "rivalScoreCategorySetting", 836990700);
        setIntField(term352476, term352476.getClass(), "playedTutorialBit", -1749072840);
        setIntField(term352476, term352476.getClass(), "firstTutorialCancelNum", 572202709);
        setLongField(term352476, term352476.getClass(), "sumTechHighScore", 5091774555642837147L);
        setLongField(term352476, term352476.getClass(), "sumTechBasicHighScore", 881457496713407955L);
        setLongField(term352476, term352476.getClass(), "sumTechAdvancedHighScore", 5757742952213471688L);
        setLongField(term352476, term352476.getClass(), "sumTechExpertHighScore", 469315883327448282L);
        setLongField(term352476, term352476.getClass(), "sumTechMasterHighScore", 8408907919167131157L);
        setLongField(term352476, term352476.getClass(), "sumTechLunaticHighScore", 9055779803110374591L);
        setLongField(term352476, term352476.getClass(), "sumBattleHighScore", 7085006464655407432L);
        setLongField(term352476, term352476.getClass(), "sumBattleBasicHighScore", -3849342080769687810L);
        setLongField(term352476, term352476.getClass(), "sumBattleAdvancedHighScore", 6555968710708894260L);
        setLongField(term352476, term352476.getClass(), "sumBattleExpertHighScore", -8355679498733841722L);
        setLongField(term352476, term352476.getClass(), "sumBattleMasterHighScore", -5626777647488032489L);
        setLongField(term352476, term352476.getClass(), "sumBattleLunaticHighScore", 234425294281227263L);
        setField(term352476, term352476.getClass(), "eventWatchedDate", "KuCXQTpUMG");
        setField(term352476, term352476.getClass(), "cmEventWatchedDate", "dWhLfviWsH");
        setField(term352476, term352476.getClass(), "firstGameId", "YsHzCbaFwH");
        setField(term352476, term352476.getClass(), "firstRomVersion", "phQgvJBxxn");
        setField(term352476, term352476.getClass(), "firstDataVersion", "xcVRLcMMmJ");
        setField(term352476, term352476.getClass(), "firstPlayDate", "QbuSimpYER");
        setField(term352476, term352476.getClass(), "lastGameId", "lAPixbLLdU");
        setField(term352476, term352476.getClass(), "lastRomVersion", "fzfWRhUDke");
        setField(term352476, term352476.getClass(), "lastDataVersion", "EdGLEStHyp");
        setField(term352476, term352476.getClass(), "compatibleCmVersion", "AwTpBBJuvc");
        setField(term352476, term352476.getClass(), "lastPlayDate", "CfsuhZecYL");
        setIntField(term352476, term352476.getClass(), "lastPlaceId", 868499508);
        setField(term352476, term352476.getClass(), "lastPlaceName", "uFEDBORubp");
        setIntField(term352476, term352476.getClass(), "lastRegionId", -937584070);
        setField(term352476, term352476.getClass(), "lastRegionName", "yguNdRRwAV");
        setIntField(term352476, term352476.getClass(), "lastAllNetId", -151975583);
        setField(term352476, term352476.getClass(), "lastClientId", "OMNvqBXSPI");
        setIntField(term352476, term352476.getClass(), "lastUsedDeckId", 512142844);
        setIntField(term352476, term352476.getClass(), "lastPlayMusicLevel", 1431469010);
        setIntField(term352476, term352476.getClass(), "lastEmoneyBrand", -572433456);
        setField(term352474, term352474.getClass(), "user", term352476);
        setIntField(term352474, term352474.getClass(), "eventId", 1918188503);
        setIntField(term352474, term352474.getClass(), "totalTechScore", -1028237459);
        setIntField(term352474, term352474.getClass(), "totalPlatinumScore", -2014249321);
        setField(term352474, term352474.getClass(), "techRecordDate", "OlMIEzlBnP");
        setBooleanField(term352474, term352474.getClass(), "isRankingRewarded", false);
        setBooleanField(term352474, term352474.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term352474, args);
    }

};


