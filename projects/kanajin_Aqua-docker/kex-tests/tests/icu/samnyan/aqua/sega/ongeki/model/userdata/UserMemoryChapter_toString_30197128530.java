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

public class UserMemoryChapter_toString_30197128530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402427;

    public UserMemoryChapter_toString_30197128530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term402433 = new Long(4369503082568083627L);
        term402427 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term402429 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term402431 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term402447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402452 = newInstance(Class.forName("java.time.LocalTime"));
        Object term402457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402462 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term402427, term402427.getClass(), "id", 4955738185628628826L);
        setLongField(term402429, term402429.getClass(), "id", -8297788425518233457L);
        setLongField(term402431, term402431.getClass(), "id", -5792034495091927806L);
        setField(term402431, term402431.getClass(), "extId", term402433);
        setField(term402431, term402431.getClass(), "luid", "gzrUdbYwOf");
        setIntField(term402448, term402448.getClass(), "year", 2019);
        setShortField(term402448, term402448.getClass(), "month", (short) 5);
        setShortField(term402448, term402448.getClass(), "day", (short) 2);
        setField(term402447, term402447.getClass(), "date", term402448);
        setByteField(term402452, term402452.getClass(), "hour", (byte) 22);
        setByteField(term402452, term402452.getClass(), "minute", (byte) 0);
        setByteField(term402452, term402452.getClass(), "second", (byte) 24);
        setIntField(term402452, term402452.getClass(), "nano", 489512842);
        setField(term402447, term402447.getClass(), "time", term402452);
        setField(term402431, term402431.getClass(), "registerTime", term402447);
        setIntField(term402458, term402458.getClass(), "year", 2022);
        setShortField(term402458, term402458.getClass(), "month", (short) 2);
        setShortField(term402458, term402458.getClass(), "day", (short) 13);
        setField(term402457, term402457.getClass(), "date", term402458);
        setByteField(term402462, term402462.getClass(), "hour", (byte) 23);
        setByteField(term402462, term402462.getClass(), "minute", (byte) 45);
        setByteField(term402462, term402462.getClass(), "second", (byte) 24);
        setIntField(term402462, term402462.getClass(), "nano", 403337978);
        setField(term402457, term402457.getClass(), "time", term402462);
        setField(term402431, term402431.getClass(), "accessTime", term402457);
        setField(term402429, term402429.getClass(), "card", term402431);
        setField(term402429, term402429.getClass(), "userName", "kwcznONOPG");
        setIntField(term402429, term402429.getClass(), "level", 2094600540);
        setIntField(term402429, term402429.getClass(), "reincarnationNum", -1924516260);
        setLongField(term402429, term402429.getClass(), "exp", -6102054856844419101L);
        setLongField(term402429, term402429.getClass(), "point", 1261121221020028585L);
        setLongField(term402429, term402429.getClass(), "totalPoint", -3794962090779425961L);
        setIntField(term402429, term402429.getClass(), "playCount", -1155279918);
        setIntField(term402429, term402429.getClass(), "jewelCount", -1699655133);
        setIntField(term402429, term402429.getClass(), "totalJewelCount", -1316416964);
        setIntField(term402429, term402429.getClass(), "medalCount", 2102905592);
        setIntField(term402429, term402429.getClass(), "playerRating", -154563925);
        setIntField(term402429, term402429.getClass(), "highestRating", -1804917670);
        setIntField(term402429, term402429.getClass(), "battlePoint", -209531853);
        setIntField(term402429, term402429.getClass(), "bestBattlePoint", 2134466361);
        setIntField(term402429, term402429.getClass(), "overDamageBattlePoint", 262124514);
        setBooleanField(term402429, term402429.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term402429, term402429.getClass(), "nameplateId", 1430124035);
        setIntField(term402429, term402429.getClass(), "trophyId", 477720421);
        setIntField(term402429, term402429.getClass(), "cardId", 322541471);
        setIntField(term402429, term402429.getClass(), "characterId", 2079845372);
        setIntField(term402429, term402429.getClass(), "characterVoiceNo", 352831213);
        setIntField(term402429, term402429.getClass(), "tabSetting", 1494277282);
        setIntField(term402429, term402429.getClass(), "tabSortSetting", -953937022);
        setIntField(term402429, term402429.getClass(), "cardCategorySetting", 2069561506);
        setIntField(term402429, term402429.getClass(), "cardSortSetting", 152166838);
        setIntField(term402429, term402429.getClass(), "rivalScoreCategorySetting", -657220632);
        setIntField(term402429, term402429.getClass(), "playedTutorialBit", -685114554);
        setIntField(term402429, term402429.getClass(), "firstTutorialCancelNum", 529282251);
        setLongField(term402429, term402429.getClass(), "sumTechHighScore", -6273896411740041379L);
        setLongField(term402429, term402429.getClass(), "sumTechBasicHighScore", 2608197156995785706L);
        setLongField(term402429, term402429.getClass(), "sumTechAdvancedHighScore", 4407143508564865762L);
        setLongField(term402429, term402429.getClass(), "sumTechExpertHighScore", 9150378657822739421L);
        setLongField(term402429, term402429.getClass(), "sumTechMasterHighScore", 2864485934162096854L);
        setLongField(term402429, term402429.getClass(), "sumTechLunaticHighScore", -6544538385658426764L);
        setLongField(term402429, term402429.getClass(), "sumBattleHighScore", -2630031637664316907L);
        setLongField(term402429, term402429.getClass(), "sumBattleBasicHighScore", 6937552757235439613L);
        setLongField(term402429, term402429.getClass(), "sumBattleAdvancedHighScore", 354188091531442782L);
        setLongField(term402429, term402429.getClass(), "sumBattleExpertHighScore", 6115081060986828305L);
        setLongField(term402429, term402429.getClass(), "sumBattleMasterHighScore", 2221541506205302838L);
        setLongField(term402429, term402429.getClass(), "sumBattleLunaticHighScore", 9043436389025812505L);
        setField(term402429, term402429.getClass(), "eventWatchedDate", "OFaijQbNnr");
        setField(term402429, term402429.getClass(), "cmEventWatchedDate", "khbCokfzlD");
        setField(term402429, term402429.getClass(), "firstGameId", "TwYipOaMFn");
        setField(term402429, term402429.getClass(), "firstRomVersion", "USVFTfPMvE");
        setField(term402429, term402429.getClass(), "firstDataVersion", "QSFDsvmOAn");
        setField(term402429, term402429.getClass(), "firstPlayDate", "XsgQcrDFmG");
        setField(term402429, term402429.getClass(), "lastGameId", "gxqfXDXyBy");
        setField(term402429, term402429.getClass(), "lastRomVersion", "TEocSCbHQq");
        setField(term402429, term402429.getClass(), "lastDataVersion", "vreoAlzwzi");
        setField(term402429, term402429.getClass(), "compatibleCmVersion", "BgYFngzOet");
        setField(term402429, term402429.getClass(), "lastPlayDate", "seKGdIKnET");
        setIntField(term402429, term402429.getClass(), "lastPlaceId", 853358356);
        setField(term402429, term402429.getClass(), "lastPlaceName", "jteyKUPaxv");
        setIntField(term402429, term402429.getClass(), "lastRegionId", 2125674284);
        setField(term402429, term402429.getClass(), "lastRegionName", "UGpJklqpOC");
        setIntField(term402429, term402429.getClass(), "lastAllNetId", 1254407628);
        setField(term402429, term402429.getClass(), "lastClientId", "wVrgphoKXK");
        setIntField(term402429, term402429.getClass(), "lastUsedDeckId", -1908792550);
        setIntField(term402429, term402429.getClass(), "lastPlayMusicLevel", -1341613454);
        setIntField(term402429, term402429.getClass(), "lastEmoneyBrand", -252904103);
        setField(term402427, term402427.getClass(), "user", term402429);
        setIntField(term402427, term402427.getClass(), "chapterId", -2147307221);
        setIntField(term402427, term402427.getClass(), "jewelCount", 1727062660);
        setIntField(term402427, term402427.getClass(), "lastPlayMusicCategory", -1366969410);
        setIntField(term402427, term402427.getClass(), "lastPlayMusicId", -330731111);
        setIntField(term402427, term402427.getClass(), "lastPlayMusicLevel", 640715423);
        setBooleanField(term402427, term402427.getClass(), "isDialogWatched", false);
        setBooleanField(term402427, term402427.getClass(), "isStoryWatched", false);
        setBooleanField(term402427, term402427.getClass(), "isBossWatched", false);
        setBooleanField(term402427, term402427.getClass(), "isClear", true);
        setIntField(term402427, term402427.getClass(), "gaugeId", -336113355);
        setIntField(term402427, term402427.getClass(), "gaugeNum", 1716173441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term402427, args);
    }

};


