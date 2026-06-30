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

public class UserChapter_setSkipTiming2_185071012222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93178;
     Object term93452;

    public UserChapter_setSkipTiming2_185071012222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93184 = new Long(5731563613239387113L);
        term93178 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term93180 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term93182 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term93198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93213 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term93178, term93178.getClass(), "id", 6122115298694402118L);
        setLongField(term93180, term93180.getClass(), "id", -2546031325453902070L);
        setLongField(term93182, term93182.getClass(), "id", -7091739015429390563L);
        setField(term93182, term93182.getClass(), "extId", term93184);
        setField(term93182, term93182.getClass(), "luid", "plqwsHlTLA");
        setIntField(term93199, term93199.getClass(), "year", 2026);
        setShortField(term93199, term93199.getClass(), "month", (short) 12);
        setShortField(term93199, term93199.getClass(), "day", (short) 22);
        setField(term93198, term93198.getClass(), "date", term93199);
        setByteField(term93203, term93203.getClass(), "hour", (byte) 19);
        setByteField(term93203, term93203.getClass(), "minute", (byte) 39);
        setByteField(term93203, term93203.getClass(), "second", (byte) 23);
        setIntField(term93203, term93203.getClass(), "nano", 342247024);
        setField(term93198, term93198.getClass(), "time", term93203);
        setField(term93182, term93182.getClass(), "registerTime", term93198);
        setIntField(term93209, term93209.getClass(), "year", 2020);
        setShortField(term93209, term93209.getClass(), "month", (short) 5);
        setShortField(term93209, term93209.getClass(), "day", (short) 8);
        setField(term93208, term93208.getClass(), "date", term93209);
        setByteField(term93213, term93213.getClass(), "hour", (byte) 8);
        setByteField(term93213, term93213.getClass(), "minute", (byte) 25);
        setByteField(term93213, term93213.getClass(), "second", (byte) 28);
        setIntField(term93213, term93213.getClass(), "nano", 159788425);
        setField(term93208, term93208.getClass(), "time", term93213);
        setField(term93182, term93182.getClass(), "accessTime", term93208);
        setField(term93180, term93180.getClass(), "card", term93182);
        setField(term93180, term93180.getClass(), "userName", "DDkbTPlKrm");
        setIntField(term93180, term93180.getClass(), "level", 977791910);
        setIntField(term93180, term93180.getClass(), "reincarnationNum", 1763791756);
        setLongField(term93180, term93180.getClass(), "exp", 5505498556069200636L);
        setLongField(term93180, term93180.getClass(), "point", 8319967949998053430L);
        setLongField(term93180, term93180.getClass(), "totalPoint", -1540690618431069323L);
        setIntField(term93180, term93180.getClass(), "playCount", 1902011317);
        setIntField(term93180, term93180.getClass(), "jewelCount", 739273183);
        setIntField(term93180, term93180.getClass(), "totalJewelCount", 577671776);
        setIntField(term93180, term93180.getClass(), "medalCount", -573536902);
        setIntField(term93180, term93180.getClass(), "playerRating", -1477265705);
        setIntField(term93180, term93180.getClass(), "highestRating", 560880959);
        setIntField(term93180, term93180.getClass(), "battlePoint", -175208201);
        setIntField(term93180, term93180.getClass(), "bestBattlePoint", -129568329);
        setIntField(term93180, term93180.getClass(), "overDamageBattlePoint", -1439138016);
        setBooleanField(term93180, term93180.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term93180, term93180.getClass(), "nameplateId", 299991969);
        setIntField(term93180, term93180.getClass(), "trophyId", -314712088);
        setIntField(term93180, term93180.getClass(), "cardId", 673401830);
        setIntField(term93180, term93180.getClass(), "characterId", 274393548);
        setIntField(term93180, term93180.getClass(), "characterVoiceNo", 2009167871);
        setIntField(term93180, term93180.getClass(), "tabSetting", -1001649335);
        setIntField(term93180, term93180.getClass(), "tabSortSetting", -1983284991);
        setIntField(term93180, term93180.getClass(), "cardCategorySetting", 386592778);
        setIntField(term93180, term93180.getClass(), "cardSortSetting", 1718374650);
        setIntField(term93180, term93180.getClass(), "rivalScoreCategorySetting", -1170695156);
        setIntField(term93180, term93180.getClass(), "playedTutorialBit", -854423228);
        setIntField(term93180, term93180.getClass(), "firstTutorialCancelNum", -135398430);
        setLongField(term93180, term93180.getClass(), "sumTechHighScore", 4149378651748540208L);
        setLongField(term93180, term93180.getClass(), "sumTechBasicHighScore", 5605172167231177997L);
        setLongField(term93180, term93180.getClass(), "sumTechAdvancedHighScore", 5736786634821331574L);
        setLongField(term93180, term93180.getClass(), "sumTechExpertHighScore", -7704912290524056833L);
        setLongField(term93180, term93180.getClass(), "sumTechMasterHighScore", -7964141454757798019L);
        setLongField(term93180, term93180.getClass(), "sumTechLunaticHighScore", -8108561590335594741L);
        setLongField(term93180, term93180.getClass(), "sumBattleHighScore", -3640864148845613238L);
        setLongField(term93180, term93180.getClass(), "sumBattleBasicHighScore", 405446700030466973L);
        setLongField(term93180, term93180.getClass(), "sumBattleAdvancedHighScore", 6085713762800785207L);
        setLongField(term93180, term93180.getClass(), "sumBattleExpertHighScore", 1123327822305694766L);
        setLongField(term93180, term93180.getClass(), "sumBattleMasterHighScore", -7893702611376690699L);
        setLongField(term93180, term93180.getClass(), "sumBattleLunaticHighScore", 665607857695451113L);
        setField(term93180, term93180.getClass(), "eventWatchedDate", "EElRQZBfvW");
        setField(term93180, term93180.getClass(), "cmEventWatchedDate", "grlbPsQxaR");
        setField(term93180, term93180.getClass(), "firstGameId", "PeFIZXlxPN");
        setField(term93180, term93180.getClass(), "firstRomVersion", "OIXYYXGdlX");
        setField(term93180, term93180.getClass(), "firstDataVersion", "VBfWgJrVqV");
        setField(term93180, term93180.getClass(), "firstPlayDate", "BgFpfnZiJG");
        setField(term93180, term93180.getClass(), "lastGameId", "tMDFwEQAGW");
        setField(term93180, term93180.getClass(), "lastRomVersion", "heAByNySVP");
        setField(term93180, term93180.getClass(), "lastDataVersion", "gPuVkQobYQ");
        setField(term93180, term93180.getClass(), "compatibleCmVersion", "sAHDMENVSp");
        setField(term93180, term93180.getClass(), "lastPlayDate", "oLoxfeWIGH");
        setIntField(term93180, term93180.getClass(), "lastPlaceId", 1404546541);
        setField(term93180, term93180.getClass(), "lastPlaceName", "vdErTHSsJu");
        setIntField(term93180, term93180.getClass(), "lastRegionId", 1350945157);
        setField(term93180, term93180.getClass(), "lastRegionName", "MeFZCtLbdV");
        setIntField(term93180, term93180.getClass(), "lastAllNetId", 917364076);
        setField(term93180, term93180.getClass(), "lastClientId", "oNgxBniAuz");
        setIntField(term93180, term93180.getClass(), "lastUsedDeckId", 727152467);
        setIntField(term93180, term93180.getClass(), "lastPlayMusicLevel", -138608321);
        setIntField(term93180, term93180.getClass(), "lastEmoneyBrand", 2095812393);
        setField(term93178, term93178.getClass(), "user", term93180);
        setIntField(term93178, term93178.getClass(), "chapterId", 1431497505);
        setIntField(term93178, term93178.getClass(), "jewelCount", -135681605);
        setIntField(term93178, term93178.getClass(), "lastPlayMusicCategory", -881873928);
        setIntField(term93178, term93178.getClass(), "lastPlayMusicId", 813195927);
        setIntField(term93178, term93178.getClass(), "lastPlayMusicLevel", 837178544);
        setBooleanField(term93178, term93178.getClass(), "isStoryWatched", false);
        setBooleanField(term93178, term93178.getClass(), "isClear", false);
        setIntField(term93178, term93178.getClass(), "skipTiming1", 933005179);
        setIntField(term93178, term93178.getClass(), "skipTiming2", -1371488618);
        term93452 = new Integer(-1728526884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term93452;
        callMethod(klass, "setSkipTiming2", argTypes, term93178, args);
    }

};


