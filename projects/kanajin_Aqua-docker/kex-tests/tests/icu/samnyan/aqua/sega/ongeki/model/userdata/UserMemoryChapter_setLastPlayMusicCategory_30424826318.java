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

public class UserMemoryChapter_setLastPlayMusicCategory_30424826318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397175;
     Object term397451;

    public UserMemoryChapter_setLastPlayMusicCategory_30424826318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term397181 = new Long(-4987344934532917085L);
        term397175 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term397177 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term397179 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term397195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term397196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term397200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term397205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term397206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term397210 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term397175, term397175.getClass(), "id", -5743716942084093819L);
        setLongField(term397177, term397177.getClass(), "id", -3761687501434493555L);
        setLongField(term397179, term397179.getClass(), "id", 6923371778481878441L);
        setField(term397179, term397179.getClass(), "extId", term397181);
        setField(term397179, term397179.getClass(), "luid", "BcsNDdBoEG");
        setIntField(term397196, term397196.getClass(), "year", 2014);
        setShortField(term397196, term397196.getClass(), "month", (short) 6);
        setShortField(term397196, term397196.getClass(), "day", (short) 1);
        setField(term397195, term397195.getClass(), "date", term397196);
        setByteField(term397200, term397200.getClass(), "hour", (byte) 2);
        setByteField(term397200, term397200.getClass(), "minute", (byte) 11);
        setByteField(term397200, term397200.getClass(), "second", (byte) 31);
        setIntField(term397200, term397200.getClass(), "nano", 145635910);
        setField(term397195, term397195.getClass(), "time", term397200);
        setField(term397179, term397179.getClass(), "registerTime", term397195);
        setIntField(term397206, term397206.getClass(), "year", 2025);
        setShortField(term397206, term397206.getClass(), "month", (short) 9);
        setShortField(term397206, term397206.getClass(), "day", (short) 20);
        setField(term397205, term397205.getClass(), "date", term397206);
        setByteField(term397210, term397210.getClass(), "hour", (byte) 16);
        setByteField(term397210, term397210.getClass(), "minute", (byte) 57);
        setByteField(term397210, term397210.getClass(), "second", (byte) 31);
        setIntField(term397210, term397210.getClass(), "nano", 349799459);
        setField(term397205, term397205.getClass(), "time", term397210);
        setField(term397179, term397179.getClass(), "accessTime", term397205);
        setField(term397177, term397177.getClass(), "card", term397179);
        setField(term397177, term397177.getClass(), "userName", "IfftapjJCR");
        setIntField(term397177, term397177.getClass(), "level", 122359361);
        setIntField(term397177, term397177.getClass(), "reincarnationNum", 920869768);
        setLongField(term397177, term397177.getClass(), "exp", -2664657769396188905L);
        setLongField(term397177, term397177.getClass(), "point", -7805613835090517266L);
        setLongField(term397177, term397177.getClass(), "totalPoint", -2960551939365707278L);
        setIntField(term397177, term397177.getClass(), "playCount", 2129883477);
        setIntField(term397177, term397177.getClass(), "jewelCount", -370264783);
        setIntField(term397177, term397177.getClass(), "totalJewelCount", 256664353);
        setIntField(term397177, term397177.getClass(), "medalCount", 481153457);
        setIntField(term397177, term397177.getClass(), "playerRating", 2010784287);
        setIntField(term397177, term397177.getClass(), "highestRating", -1607290212);
        setIntField(term397177, term397177.getClass(), "battlePoint", 1026866016);
        setIntField(term397177, term397177.getClass(), "bestBattlePoint", 1290909036);
        setIntField(term397177, term397177.getClass(), "overDamageBattlePoint", -554344114);
        setBooleanField(term397177, term397177.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term397177, term397177.getClass(), "nameplateId", 662301931);
        setIntField(term397177, term397177.getClass(), "trophyId", 1119786634);
        setIntField(term397177, term397177.getClass(), "cardId", -320546575);
        setIntField(term397177, term397177.getClass(), "characterId", -496076106);
        setIntField(term397177, term397177.getClass(), "characterVoiceNo", 1741081255);
        setIntField(term397177, term397177.getClass(), "tabSetting", 1707864093);
        setIntField(term397177, term397177.getClass(), "tabSortSetting", 1741591472);
        setIntField(term397177, term397177.getClass(), "cardCategorySetting", 451935394);
        setIntField(term397177, term397177.getClass(), "cardSortSetting", 932710632);
        setIntField(term397177, term397177.getClass(), "rivalScoreCategorySetting", -1676442276);
        setIntField(term397177, term397177.getClass(), "playedTutorialBit", 469431701);
        setIntField(term397177, term397177.getClass(), "firstTutorialCancelNum", -370039869);
        setLongField(term397177, term397177.getClass(), "sumTechHighScore", 6033165802535975223L);
        setLongField(term397177, term397177.getClass(), "sumTechBasicHighScore", 2755312857820090237L);
        setLongField(term397177, term397177.getClass(), "sumTechAdvancedHighScore", -7834079687983203731L);
        setLongField(term397177, term397177.getClass(), "sumTechExpertHighScore", 7406582048091992868L);
        setLongField(term397177, term397177.getClass(), "sumTechMasterHighScore", 2503971592095458212L);
        setLongField(term397177, term397177.getClass(), "sumTechLunaticHighScore", 483652353726945577L);
        setLongField(term397177, term397177.getClass(), "sumBattleHighScore", 5923292358480924028L);
        setLongField(term397177, term397177.getClass(), "sumBattleBasicHighScore", -8917633736802211417L);
        setLongField(term397177, term397177.getClass(), "sumBattleAdvancedHighScore", 6841951969811132105L);
        setLongField(term397177, term397177.getClass(), "sumBattleExpertHighScore", 7029460330693322196L);
        setLongField(term397177, term397177.getClass(), "sumBattleMasterHighScore", 1899971755457488246L);
        setLongField(term397177, term397177.getClass(), "sumBattleLunaticHighScore", 8851463727956587910L);
        setField(term397177, term397177.getClass(), "eventWatchedDate", "yoGAoQLIKE");
        setField(term397177, term397177.getClass(), "cmEventWatchedDate", "nlaIYkdGIQ");
        setField(term397177, term397177.getClass(), "firstGameId", "cNAUkICIpx");
        setField(term397177, term397177.getClass(), "firstRomVersion", "bMigxbzuuS");
        setField(term397177, term397177.getClass(), "firstDataVersion", "bnSThbPhHW");
        setField(term397177, term397177.getClass(), "firstPlayDate", "IOLYTZmMMj");
        setField(term397177, term397177.getClass(), "lastGameId", "HtAoAeXGLq");
        setField(term397177, term397177.getClass(), "lastRomVersion", "ulIkEIPaQx");
        setField(term397177, term397177.getClass(), "lastDataVersion", "SigYKjNYHQ");
        setField(term397177, term397177.getClass(), "compatibleCmVersion", "YSRaxgpNjj");
        setField(term397177, term397177.getClass(), "lastPlayDate", "dpcadAPyPn");
        setIntField(term397177, term397177.getClass(), "lastPlaceId", -718738881);
        setField(term397177, term397177.getClass(), "lastPlaceName", "TmiuCALpTz");
        setIntField(term397177, term397177.getClass(), "lastRegionId", 989602914);
        setField(term397177, term397177.getClass(), "lastRegionName", "ttuwIVnIEZ");
        setIntField(term397177, term397177.getClass(), "lastAllNetId", -2104006003);
        setField(term397177, term397177.getClass(), "lastClientId", "PUUpHwRvlG");
        setIntField(term397177, term397177.getClass(), "lastUsedDeckId", -482176412);
        setIntField(term397177, term397177.getClass(), "lastPlayMusicLevel", -2920491);
        setIntField(term397177, term397177.getClass(), "lastEmoneyBrand", -353019783);
        setField(term397175, term397175.getClass(), "user", term397177);
        setIntField(term397175, term397175.getClass(), "chapterId", 750228039);
        setIntField(term397175, term397175.getClass(), "jewelCount", -1029486878);
        setIntField(term397175, term397175.getClass(), "lastPlayMusicCategory", -1459978028);
        setIntField(term397175, term397175.getClass(), "lastPlayMusicId", 1656620972);
        setIntField(term397175, term397175.getClass(), "lastPlayMusicLevel", -1905700801);
        setBooleanField(term397175, term397175.getClass(), "isDialogWatched", true);
        setBooleanField(term397175, term397175.getClass(), "isStoryWatched", false);
        setBooleanField(term397175, term397175.getClass(), "isBossWatched", true);
        setBooleanField(term397175, term397175.getClass(), "isClear", false);
        setIntField(term397175, term397175.getClass(), "gaugeId", 627311963);
        setIntField(term397175, term397175.getClass(), "gaugeNum", -647715835);
        term397451 = new Integer(-318843494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term397451;
        callMethod(klass, "setLastPlayMusicCategory", argTypes, term397175, args);
    }

};


