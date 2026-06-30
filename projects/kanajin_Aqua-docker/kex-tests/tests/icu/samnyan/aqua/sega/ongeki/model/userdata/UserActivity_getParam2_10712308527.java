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

public class UserActivity_getParam2_10712308527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285746;

    public UserActivity_getParam2_10712308527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term285752 = new Long(-8985577692063635272L);
        term285746 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term285748 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term285750 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term285766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285781 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term285746, term285746.getClass(), "id", 1408308792424360630L);
        setLongField(term285748, term285748.getClass(), "id", -4685504927020626544L);
        setLongField(term285750, term285750.getClass(), "id", 5698258819105588763L);
        setField(term285750, term285750.getClass(), "extId", term285752);
        setField(term285750, term285750.getClass(), "luid", "bAowmWKEGP");
        setIntField(term285767, term285767.getClass(), "year", 2018);
        setShortField(term285767, term285767.getClass(), "month", (short) 6);
        setShortField(term285767, term285767.getClass(), "day", (short) 7);
        setField(term285766, term285766.getClass(), "date", term285767);
        setByteField(term285771, term285771.getClass(), "hour", (byte) 22);
        setByteField(term285771, term285771.getClass(), "minute", (byte) 15);
        setByteField(term285771, term285771.getClass(), "second", (byte) 58);
        setIntField(term285771, term285771.getClass(), "nano", 252673627);
        setField(term285766, term285766.getClass(), "time", term285771);
        setField(term285750, term285750.getClass(), "registerTime", term285766);
        setIntField(term285777, term285777.getClass(), "year", 2011);
        setShortField(term285777, term285777.getClass(), "month", (short) 11);
        setShortField(term285777, term285777.getClass(), "day", (short) 13);
        setField(term285776, term285776.getClass(), "date", term285777);
        setByteField(term285781, term285781.getClass(), "hour", (byte) 10);
        setByteField(term285781, term285781.getClass(), "minute", (byte) 12);
        setByteField(term285781, term285781.getClass(), "second", (byte) 25);
        setIntField(term285781, term285781.getClass(), "nano", 943332183);
        setField(term285776, term285776.getClass(), "time", term285781);
        setField(term285750, term285750.getClass(), "accessTime", term285776);
        setField(term285748, term285748.getClass(), "card", term285750);
        setField(term285748, term285748.getClass(), "userName", "GQZmnRhLyF");
        setIntField(term285748, term285748.getClass(), "level", -19060265);
        setIntField(term285748, term285748.getClass(), "reincarnationNum", 1142946811);
        setLongField(term285748, term285748.getClass(), "exp", 7372751998422831214L);
        setLongField(term285748, term285748.getClass(), "point", -3236896106466139553L);
        setLongField(term285748, term285748.getClass(), "totalPoint", 3456362741547347302L);
        setIntField(term285748, term285748.getClass(), "playCount", 1119090923);
        setIntField(term285748, term285748.getClass(), "jewelCount", -1831049142);
        setIntField(term285748, term285748.getClass(), "totalJewelCount", 500481472);
        setIntField(term285748, term285748.getClass(), "medalCount", 1189713463);
        setIntField(term285748, term285748.getClass(), "playerRating", -2124265740);
        setIntField(term285748, term285748.getClass(), "highestRating", -1323987937);
        setIntField(term285748, term285748.getClass(), "battlePoint", 1648984739);
        setIntField(term285748, term285748.getClass(), "bestBattlePoint", -943862445);
        setIntField(term285748, term285748.getClass(), "overDamageBattlePoint", 336759166);
        setBooleanField(term285748, term285748.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term285748, term285748.getClass(), "nameplateId", 1874264137);
        setIntField(term285748, term285748.getClass(), "trophyId", 459893515);
        setIntField(term285748, term285748.getClass(), "cardId", -2030419332);
        setIntField(term285748, term285748.getClass(), "characterId", 1173366554);
        setIntField(term285748, term285748.getClass(), "characterVoiceNo", 1141843700);
        setIntField(term285748, term285748.getClass(), "tabSetting", -1254571797);
        setIntField(term285748, term285748.getClass(), "tabSortSetting", 1516402627);
        setIntField(term285748, term285748.getClass(), "cardCategorySetting", -1450020194);
        setIntField(term285748, term285748.getClass(), "cardSortSetting", -2093580285);
        setIntField(term285748, term285748.getClass(), "rivalScoreCategorySetting", 1276267490);
        setIntField(term285748, term285748.getClass(), "playedTutorialBit", 1539388177);
        setIntField(term285748, term285748.getClass(), "firstTutorialCancelNum", -1014299388);
        setLongField(term285748, term285748.getClass(), "sumTechHighScore", -2249858088650287830L);
        setLongField(term285748, term285748.getClass(), "sumTechBasicHighScore", -7798380725320586071L);
        setLongField(term285748, term285748.getClass(), "sumTechAdvancedHighScore", 7060591539194552868L);
        setLongField(term285748, term285748.getClass(), "sumTechExpertHighScore", 4019861519423005233L);
        setLongField(term285748, term285748.getClass(), "sumTechMasterHighScore", 71350167553012890L);
        setLongField(term285748, term285748.getClass(), "sumTechLunaticHighScore", -2179702800258844158L);
        setLongField(term285748, term285748.getClass(), "sumBattleHighScore", -8617007520706212005L);
        setLongField(term285748, term285748.getClass(), "sumBattleBasicHighScore", 6453677090604811442L);
        setLongField(term285748, term285748.getClass(), "sumBattleAdvancedHighScore", -5195578350781131037L);
        setLongField(term285748, term285748.getClass(), "sumBattleExpertHighScore", -8580890735987849173L);
        setLongField(term285748, term285748.getClass(), "sumBattleMasterHighScore", 6064389719862778299L);
        setLongField(term285748, term285748.getClass(), "sumBattleLunaticHighScore", -6023378852101924688L);
        setField(term285748, term285748.getClass(), "eventWatchedDate", "CIJyIgGonf");
        setField(term285748, term285748.getClass(), "cmEventWatchedDate", "uhIWNRNIgh");
        setField(term285748, term285748.getClass(), "firstGameId", "wFXoQDJRmN");
        setField(term285748, term285748.getClass(), "firstRomVersion", "JYcRvcwyES");
        setField(term285748, term285748.getClass(), "firstDataVersion", "EIyXptwVyk");
        setField(term285748, term285748.getClass(), "firstPlayDate", "fgnBfpvzBR");
        setField(term285748, term285748.getClass(), "lastGameId", "QGtfeKLTbS");
        setField(term285748, term285748.getClass(), "lastRomVersion", "mmeVnvqGFB");
        setField(term285748, term285748.getClass(), "lastDataVersion", "uaCErguuKj");
        setField(term285748, term285748.getClass(), "compatibleCmVersion", "CWIkxfoXOn");
        setField(term285748, term285748.getClass(), "lastPlayDate", "paSMyMWJmJ");
        setIntField(term285748, term285748.getClass(), "lastPlaceId", 2074003232);
        setField(term285748, term285748.getClass(), "lastPlaceName", "BfEbeOIyEv");
        setIntField(term285748, term285748.getClass(), "lastRegionId", 906827712);
        setField(term285748, term285748.getClass(), "lastRegionName", "wKtDelthfw");
        setIntField(term285748, term285748.getClass(), "lastAllNetId", 1397267544);
        setField(term285748, term285748.getClass(), "lastClientId", "gFOGAVnoKy");
        setIntField(term285748, term285748.getClass(), "lastUsedDeckId", -1603972719);
        setIntField(term285748, term285748.getClass(), "lastPlayMusicLevel", -1154654443);
        setIntField(term285748, term285748.getClass(), "lastEmoneyBrand", 1645846345);
        setField(term285746, term285746.getClass(), "user", term285748);
        setIntField(term285746, term285746.getClass(), "kind", -803632373);
        setIntField(term285746, term285746.getClass(), "activityId", -725034951);
        setIntField(term285746, term285746.getClass(), "sortNumber", 54566490);
        setIntField(term285746, term285746.getClass(), "param1", -243245256);
        setIntField(term285746, term285746.getClass(), "param2", 988657359);
        setIntField(term285746, term285746.getClass(), "param3", 1436654145);
        setIntField(term285746, term285746.getClass(), "param4", 1776603374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term285746, args);
    }

};


