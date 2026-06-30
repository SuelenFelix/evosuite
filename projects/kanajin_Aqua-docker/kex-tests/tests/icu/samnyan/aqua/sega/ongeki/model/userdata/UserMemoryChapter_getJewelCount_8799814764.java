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

public class UserMemoryChapter_getJewelCount_8799814764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390642;

    public UserMemoryChapter_getJewelCount_8799814764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term390648 = new Long(-3355167737637002830L);
        term390642 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term390644 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term390646 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term390662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term390663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term390667 = newInstance(Class.forName("java.time.LocalTime"));
        Object term390672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term390673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term390677 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term390642, term390642.getClass(), "id", 8524092659982713266L);
        setLongField(term390644, term390644.getClass(), "id", -3008410149251298268L);
        setLongField(term390646, term390646.getClass(), "id", 7015893554992153088L);
        setField(term390646, term390646.getClass(), "extId", term390648);
        setField(term390646, term390646.getClass(), "luid", "iPZvljcDTp");
        setIntField(term390663, term390663.getClass(), "year", 2014);
        setShortField(term390663, term390663.getClass(), "month", (short) 12);
        setShortField(term390663, term390663.getClass(), "day", (short) 11);
        setField(term390662, term390662.getClass(), "date", term390663);
        setByteField(term390667, term390667.getClass(), "hour", (byte) 6);
        setByteField(term390667, term390667.getClass(), "minute", (byte) 5);
        setByteField(term390667, term390667.getClass(), "second", (byte) 33);
        setIntField(term390667, term390667.getClass(), "nano", 20756797);
        setField(term390662, term390662.getClass(), "time", term390667);
        setField(term390646, term390646.getClass(), "registerTime", term390662);
        setIntField(term390673, term390673.getClass(), "year", 2025);
        setShortField(term390673, term390673.getClass(), "month", (short) 12);
        setShortField(term390673, term390673.getClass(), "day", (short) 6);
        setField(term390672, term390672.getClass(), "date", term390673);
        setByteField(term390677, term390677.getClass(), "hour", (byte) 11);
        setByteField(term390677, term390677.getClass(), "minute", (byte) 45);
        setByteField(term390677, term390677.getClass(), "second", (byte) 47);
        setIntField(term390677, term390677.getClass(), "nano", 496361054);
        setField(term390672, term390672.getClass(), "time", term390677);
        setField(term390646, term390646.getClass(), "accessTime", term390672);
        setField(term390644, term390644.getClass(), "card", term390646);
        setField(term390644, term390644.getClass(), "userName", "TzIEOVYqiv");
        setIntField(term390644, term390644.getClass(), "level", -329961621);
        setIntField(term390644, term390644.getClass(), "reincarnationNum", 1546890691);
        setLongField(term390644, term390644.getClass(), "exp", -3900953191164197094L);
        setLongField(term390644, term390644.getClass(), "point", 2630163382097206969L);
        setLongField(term390644, term390644.getClass(), "totalPoint", -8916535739221247206L);
        setIntField(term390644, term390644.getClass(), "playCount", 654491621);
        setIntField(term390644, term390644.getClass(), "jewelCount", -1639591690);
        setIntField(term390644, term390644.getClass(), "totalJewelCount", -1003547453);
        setIntField(term390644, term390644.getClass(), "medalCount", 1454803709);
        setIntField(term390644, term390644.getClass(), "playerRating", -1884253535);
        setIntField(term390644, term390644.getClass(), "highestRating", 34270044);
        setIntField(term390644, term390644.getClass(), "battlePoint", -723872376);
        setIntField(term390644, term390644.getClass(), "bestBattlePoint", 1565039742);
        setIntField(term390644, term390644.getClass(), "overDamageBattlePoint", 1446350931);
        setBooleanField(term390644, term390644.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term390644, term390644.getClass(), "nameplateId", -1215465905);
        setIntField(term390644, term390644.getClass(), "trophyId", -1910889449);
        setIntField(term390644, term390644.getClass(), "cardId", -1096786995);
        setIntField(term390644, term390644.getClass(), "characterId", -1015830871);
        setIntField(term390644, term390644.getClass(), "characterVoiceNo", 512757682);
        setIntField(term390644, term390644.getClass(), "tabSetting", -1922660438);
        setIntField(term390644, term390644.getClass(), "tabSortSetting", 110288749);
        setIntField(term390644, term390644.getClass(), "cardCategorySetting", -2139204151);
        setIntField(term390644, term390644.getClass(), "cardSortSetting", 1639811317);
        setIntField(term390644, term390644.getClass(), "rivalScoreCategorySetting", -1222745570);
        setIntField(term390644, term390644.getClass(), "playedTutorialBit", -1305614514);
        setIntField(term390644, term390644.getClass(), "firstTutorialCancelNum", -1076742724);
        setLongField(term390644, term390644.getClass(), "sumTechHighScore", -5472359325859799963L);
        setLongField(term390644, term390644.getClass(), "sumTechBasicHighScore", -7279435562776967072L);
        setLongField(term390644, term390644.getClass(), "sumTechAdvancedHighScore", -6244588842790418794L);
        setLongField(term390644, term390644.getClass(), "sumTechExpertHighScore", 8147359926813448411L);
        setLongField(term390644, term390644.getClass(), "sumTechMasterHighScore", 5943525415630089802L);
        setLongField(term390644, term390644.getClass(), "sumTechLunaticHighScore", -9150205182741930189L);
        setLongField(term390644, term390644.getClass(), "sumBattleHighScore", -5646846145666536813L);
        setLongField(term390644, term390644.getClass(), "sumBattleBasicHighScore", 4753048376004329996L);
        setLongField(term390644, term390644.getClass(), "sumBattleAdvancedHighScore", -2722940564755824775L);
        setLongField(term390644, term390644.getClass(), "sumBattleExpertHighScore", 722917063797274508L);
        setLongField(term390644, term390644.getClass(), "sumBattleMasterHighScore", -3209352479065960673L);
        setLongField(term390644, term390644.getClass(), "sumBattleLunaticHighScore", -3840690306268752613L);
        setField(term390644, term390644.getClass(), "eventWatchedDate", "bUJGALeRvk");
        setField(term390644, term390644.getClass(), "cmEventWatchedDate", "TetcVnKHfO");
        setField(term390644, term390644.getClass(), "firstGameId", "PBcCJnbMXk");
        setField(term390644, term390644.getClass(), "firstRomVersion", "sRjWOPlFLL");
        setField(term390644, term390644.getClass(), "firstDataVersion", "SqcnrMvZfO");
        setField(term390644, term390644.getClass(), "firstPlayDate", "fMFZfEvjic");
        setField(term390644, term390644.getClass(), "lastGameId", "RPfMaIBfyM");
        setField(term390644, term390644.getClass(), "lastRomVersion", "uzxNiqLTnV");
        setField(term390644, term390644.getClass(), "lastDataVersion", "pRfljizVIo");
        setField(term390644, term390644.getClass(), "compatibleCmVersion", "PnsvGHElYx");
        setField(term390644, term390644.getClass(), "lastPlayDate", "BqjjPonHpl");
        setIntField(term390644, term390644.getClass(), "lastPlaceId", -1789621592);
        setField(term390644, term390644.getClass(), "lastPlaceName", "CUHcVVsilm");
        setIntField(term390644, term390644.getClass(), "lastRegionId", -1627271684);
        setField(term390644, term390644.getClass(), "lastRegionName", "KxeGiMqmlG");
        setIntField(term390644, term390644.getClass(), "lastAllNetId", -536757115);
        setField(term390644, term390644.getClass(), "lastClientId", "ZsNKoxRQhV");
        setIntField(term390644, term390644.getClass(), "lastUsedDeckId", -38474230);
        setIntField(term390644, term390644.getClass(), "lastPlayMusicLevel", 1538350416);
        setIntField(term390644, term390644.getClass(), "lastEmoneyBrand", 1555781814);
        setField(term390642, term390642.getClass(), "user", term390644);
        setIntField(term390642, term390642.getClass(), "chapterId", -1912809409);
        setIntField(term390642, term390642.getClass(), "jewelCount", 799703968);
        setIntField(term390642, term390642.getClass(), "lastPlayMusicCategory", 74115966);
        setIntField(term390642, term390642.getClass(), "lastPlayMusicId", 495443248);
        setIntField(term390642, term390642.getClass(), "lastPlayMusicLevel", 1441170931);
        setBooleanField(term390642, term390642.getClass(), "isDialogWatched", true);
        setBooleanField(term390642, term390642.getClass(), "isStoryWatched", true);
        setBooleanField(term390642, term390642.getClass(), "isBossWatched", false);
        setBooleanField(term390642, term390642.getClass(), "isClear", true);
        setIntField(term390642, term390642.getClass(), "gaugeId", -766041862);
        setIntField(term390642, term390642.getClass(), "gaugeNum", 141906204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term390642, args);
    }

};


