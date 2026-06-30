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
import java.lang.Integer;

public class UserMemoryChapter_setLastPlayMusicId_165572572419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397613;
     Object term397889;

    public UserMemoryChapter_setLastPlayMusicId_165572572419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term397619 = new Long(4832511106024339541L);
        term397613 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term397615 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term397617 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term397633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term397634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term397638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term397643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term397644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term397648 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term397613, term397613.getClass(), "id", 8713780813371812262L);
        setLongField(term397615, term397615.getClass(), "id", 3557191045587060984L);
        setLongField(term397617, term397617.getClass(), "id", 2887807802515197723L);
        setField(term397617, term397617.getClass(), "extId", term397619);
        setField(term397617, term397617.getClass(), "luid", "tsNqmBAzEs");
        setIntField(term397634, term397634.getClass(), "year", 2019);
        setShortField(term397634, term397634.getClass(), "month", (short) 2);
        setShortField(term397634, term397634.getClass(), "day", (short) 23);
        setField(term397633, term397633.getClass(), "date", term397634);
        setByteField(term397638, term397638.getClass(), "hour", (byte) 12);
        setByteField(term397638, term397638.getClass(), "minute", (byte) 6);
        setByteField(term397638, term397638.getClass(), "second", (byte) 57);
        setIntField(term397638, term397638.getClass(), "nano", 382965891);
        setField(term397633, term397633.getClass(), "time", term397638);
        setField(term397617, term397617.getClass(), "registerTime", term397633);
        setIntField(term397644, term397644.getClass(), "year", 2026);
        setShortField(term397644, term397644.getClass(), "month", (short) 5);
        setShortField(term397644, term397644.getClass(), "day", (short) 24);
        setField(term397643, term397643.getClass(), "date", term397644);
        setByteField(term397648, term397648.getClass(), "hour", (byte) 20);
        setByteField(term397648, term397648.getClass(), "minute", (byte) 2);
        setByteField(term397648, term397648.getClass(), "second", (byte) 43);
        setIntField(term397648, term397648.getClass(), "nano", 604091497);
        setField(term397643, term397643.getClass(), "time", term397648);
        setField(term397617, term397617.getClass(), "accessTime", term397643);
        setField(term397615, term397615.getClass(), "card", term397617);
        setField(term397615, term397615.getClass(), "userName", "VxJryvGgqZ");
        setIntField(term397615, term397615.getClass(), "level", -1985259529);
        setIntField(term397615, term397615.getClass(), "reincarnationNum", 2115217573);
        setLongField(term397615, term397615.getClass(), "exp", 4071480204991861453L);
        setLongField(term397615, term397615.getClass(), "point", -2685349916092598053L);
        setLongField(term397615, term397615.getClass(), "totalPoint", 491694438146039380L);
        setIntField(term397615, term397615.getClass(), "playCount", -1151979591);
        setIntField(term397615, term397615.getClass(), "jewelCount", 447176588);
        setIntField(term397615, term397615.getClass(), "totalJewelCount", -561399417);
        setIntField(term397615, term397615.getClass(), "medalCount", 2023100034);
        setIntField(term397615, term397615.getClass(), "playerRating", 893653997);
        setIntField(term397615, term397615.getClass(), "highestRating", -740645430);
        setIntField(term397615, term397615.getClass(), "battlePoint", -1210568104);
        setIntField(term397615, term397615.getClass(), "bestBattlePoint", -1229417711);
        setIntField(term397615, term397615.getClass(), "overDamageBattlePoint", 48669352);
        setBooleanField(term397615, term397615.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term397615, term397615.getClass(), "nameplateId", 1495807530);
        setIntField(term397615, term397615.getClass(), "trophyId", 624576044);
        setIntField(term397615, term397615.getClass(), "cardId", -1815195770);
        setIntField(term397615, term397615.getClass(), "characterId", 1158019752);
        setIntField(term397615, term397615.getClass(), "characterVoiceNo", -1399526423);
        setIntField(term397615, term397615.getClass(), "tabSetting", 1604674656);
        setIntField(term397615, term397615.getClass(), "tabSortSetting", -1874522083);
        setIntField(term397615, term397615.getClass(), "cardCategorySetting", 2043672637);
        setIntField(term397615, term397615.getClass(), "cardSortSetting", 1322211517);
        setIntField(term397615, term397615.getClass(), "rivalScoreCategorySetting", -1517707915);
        setIntField(term397615, term397615.getClass(), "playedTutorialBit", 1874801995);
        setIntField(term397615, term397615.getClass(), "firstTutorialCancelNum", 1109512307);
        setLongField(term397615, term397615.getClass(), "sumTechHighScore", -7601151382201720048L);
        setLongField(term397615, term397615.getClass(), "sumTechBasicHighScore", 6235700915808994828L);
        setLongField(term397615, term397615.getClass(), "sumTechAdvancedHighScore", 729029652647225135L);
        setLongField(term397615, term397615.getClass(), "sumTechExpertHighScore", 7709882480457682539L);
        setLongField(term397615, term397615.getClass(), "sumTechMasterHighScore", 7440384647054614109L);
        setLongField(term397615, term397615.getClass(), "sumTechLunaticHighScore", 4473009422220945627L);
        setLongField(term397615, term397615.getClass(), "sumBattleHighScore", -6700686536507259379L);
        setLongField(term397615, term397615.getClass(), "sumBattleBasicHighScore", 6712378500780090116L);
        setLongField(term397615, term397615.getClass(), "sumBattleAdvancedHighScore", -7631931869688460563L);
        setLongField(term397615, term397615.getClass(), "sumBattleExpertHighScore", 4853024693378729552L);
        setLongField(term397615, term397615.getClass(), "sumBattleMasterHighScore", -6474049362506572286L);
        setLongField(term397615, term397615.getClass(), "sumBattleLunaticHighScore", -2088081429247726677L);
        setField(term397615, term397615.getClass(), "eventWatchedDate", "rgFSjUUzts");
        setField(term397615, term397615.getClass(), "cmEventWatchedDate", "bzJrFgQDLd");
        setField(term397615, term397615.getClass(), "firstGameId", "IHCnCsbphV");
        setField(term397615, term397615.getClass(), "firstRomVersion", "MucriAAsmU");
        setField(term397615, term397615.getClass(), "firstDataVersion", "tcBrciTBVd");
        setField(term397615, term397615.getClass(), "firstPlayDate", "IhfqCDlDTf");
        setField(term397615, term397615.getClass(), "lastGameId", "onIHfByIKW");
        setField(term397615, term397615.getClass(), "lastRomVersion", "VasuLAoDMc");
        setField(term397615, term397615.getClass(), "lastDataVersion", "oCxJddxPqK");
        setField(term397615, term397615.getClass(), "compatibleCmVersion", "ocnlbUVLFA");
        setField(term397615, term397615.getClass(), "lastPlayDate", "tTqtLDhbrA");
        setIntField(term397615, term397615.getClass(), "lastPlaceId", -1642517718);
        setField(term397615, term397615.getClass(), "lastPlaceName", "bxzTLLeotm");
        setIntField(term397615, term397615.getClass(), "lastRegionId", -2087605044);
        setField(term397615, term397615.getClass(), "lastRegionName", "MOEKGlPKuc");
        setIntField(term397615, term397615.getClass(), "lastAllNetId", -1269959626);
        setField(term397615, term397615.getClass(), "lastClientId", "bZOdcFeKvM");
        setIntField(term397615, term397615.getClass(), "lastUsedDeckId", 841857654);
        setIntField(term397615, term397615.getClass(), "lastPlayMusicLevel", 1664099860);
        setIntField(term397615, term397615.getClass(), "lastEmoneyBrand", -1229759824);
        setField(term397613, term397613.getClass(), "user", term397615);
        setIntField(term397613, term397613.getClass(), "chapterId", 1797958247);
        setIntField(term397613, term397613.getClass(), "jewelCount", -1081652430);
        setIntField(term397613, term397613.getClass(), "lastPlayMusicCategory", -99189355);
        setIntField(term397613, term397613.getClass(), "lastPlayMusicId", -128615782);
        setIntField(term397613, term397613.getClass(), "lastPlayMusicLevel", -1710933826);
        setBooleanField(term397613, term397613.getClass(), "isDialogWatched", false);
        setBooleanField(term397613, term397613.getClass(), "isStoryWatched", false);
        setBooleanField(term397613, term397613.getClass(), "isBossWatched", false);
        setBooleanField(term397613, term397613.getClass(), "isClear", true);
        setIntField(term397613, term397613.getClass(), "gaugeId", -1574475975);
        setIntField(term397613, term397613.getClass(), "gaugeNum", -498881264);
        term397889 = new Integer(-169801297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term397889;
        callMethod(klass, "setLastPlayMusicId", argTypes, term397613, args);
    }

};


