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

public class UserMusicDetail_getMaxTeamOverKill_201137345912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409022;

    public UserMusicDetail_getMaxTeamOverKill_201137345912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409028 = new Long(-2080067238602928154L);
        term409022 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term409024 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term409026 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term409042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term409043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term409047 = newInstance(Class.forName("java.time.LocalTime"));
        Object term409052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term409053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term409057 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term409022, term409022.getClass(), "id", -7136107935516349839L);
        setLongField(term409024, term409024.getClass(), "id", -207216193437887145L);
        setLongField(term409026, term409026.getClass(), "id", -8678993299894875263L);
        setField(term409026, term409026.getClass(), "extId", term409028);
        setField(term409026, term409026.getClass(), "luid", "ZpJAWFcmcj");
        setIntField(term409043, term409043.getClass(), "year", 2018);
        setShortField(term409043, term409043.getClass(), "month", (short) 5);
        setShortField(term409043, term409043.getClass(), "day", (short) 15);
        setField(term409042, term409042.getClass(), "date", term409043);
        setByteField(term409047, term409047.getClass(), "hour", (byte) 5);
        setByteField(term409047, term409047.getClass(), "minute", (byte) 3);
        setByteField(term409047, term409047.getClass(), "second", (byte) 34);
        setIntField(term409047, term409047.getClass(), "nano", 114109344);
        setField(term409042, term409042.getClass(), "time", term409047);
        setField(term409026, term409026.getClass(), "registerTime", term409042);
        setIntField(term409053, term409053.getClass(), "year", 2012);
        setShortField(term409053, term409053.getClass(), "month", (short) 5);
        setShortField(term409053, term409053.getClass(), "day", (short) 31);
        setField(term409052, term409052.getClass(), "date", term409053);
        setByteField(term409057, term409057.getClass(), "hour", (byte) 17);
        setByteField(term409057, term409057.getClass(), "minute", (byte) 40);
        setByteField(term409057, term409057.getClass(), "second", (byte) 9);
        setIntField(term409057, term409057.getClass(), "nano", 811185655);
        setField(term409052, term409052.getClass(), "time", term409057);
        setField(term409026, term409026.getClass(), "accessTime", term409052);
        setField(term409024, term409024.getClass(), "card", term409026);
        setField(term409024, term409024.getClass(), "userName", "SNOLmcNJMJ");
        setIntField(term409024, term409024.getClass(), "level", 1960072095);
        setIntField(term409024, term409024.getClass(), "reincarnationNum", 1302995894);
        setLongField(term409024, term409024.getClass(), "exp", 5831523226469995511L);
        setLongField(term409024, term409024.getClass(), "point", 2812942122564805626L);
        setLongField(term409024, term409024.getClass(), "totalPoint", -7046295986047695281L);
        setIntField(term409024, term409024.getClass(), "playCount", 569483015);
        setIntField(term409024, term409024.getClass(), "jewelCount", -1871846942);
        setIntField(term409024, term409024.getClass(), "totalJewelCount", -1394432020);
        setIntField(term409024, term409024.getClass(), "medalCount", -669581213);
        setIntField(term409024, term409024.getClass(), "playerRating", -716079388);
        setIntField(term409024, term409024.getClass(), "highestRating", 1909215429);
        setIntField(term409024, term409024.getClass(), "battlePoint", 73009872);
        setIntField(term409024, term409024.getClass(), "bestBattlePoint", 2012132992);
        setIntField(term409024, term409024.getClass(), "overDamageBattlePoint", -895254618);
        setBooleanField(term409024, term409024.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term409024, term409024.getClass(), "nameplateId", 821633152);
        setIntField(term409024, term409024.getClass(), "trophyId", 614587732);
        setIntField(term409024, term409024.getClass(), "cardId", 1557739632);
        setIntField(term409024, term409024.getClass(), "characterId", -1485555740);
        setIntField(term409024, term409024.getClass(), "characterVoiceNo", -448518102);
        setIntField(term409024, term409024.getClass(), "tabSetting", 1254966530);
        setIntField(term409024, term409024.getClass(), "tabSortSetting", 598609916);
        setIntField(term409024, term409024.getClass(), "cardCategorySetting", 1386805386);
        setIntField(term409024, term409024.getClass(), "cardSortSetting", 608447651);
        setIntField(term409024, term409024.getClass(), "rivalScoreCategorySetting", -913102629);
        setIntField(term409024, term409024.getClass(), "playedTutorialBit", -1019327954);
        setIntField(term409024, term409024.getClass(), "firstTutorialCancelNum", 1587025134);
        setLongField(term409024, term409024.getClass(), "sumTechHighScore", -8441682245123980715L);
        setLongField(term409024, term409024.getClass(), "sumTechBasicHighScore", -812848686153529715L);
        setLongField(term409024, term409024.getClass(), "sumTechAdvancedHighScore", 4785718299598661245L);
        setLongField(term409024, term409024.getClass(), "sumTechExpertHighScore", -4468157061082693107L);
        setLongField(term409024, term409024.getClass(), "sumTechMasterHighScore", -3201514133571470122L);
        setLongField(term409024, term409024.getClass(), "sumTechLunaticHighScore", 4580986026397521403L);
        setLongField(term409024, term409024.getClass(), "sumBattleHighScore", -4895149170305055360L);
        setLongField(term409024, term409024.getClass(), "sumBattleBasicHighScore", 133828517357949500L);
        setLongField(term409024, term409024.getClass(), "sumBattleAdvancedHighScore", 1061508141965683676L);
        setLongField(term409024, term409024.getClass(), "sumBattleExpertHighScore", 3123909296078390926L);
        setLongField(term409024, term409024.getClass(), "sumBattleMasterHighScore", -678762659943476658L);
        setLongField(term409024, term409024.getClass(), "sumBattleLunaticHighScore", -9090305422882341395L);
        setField(term409024, term409024.getClass(), "eventWatchedDate", "MKNgSvnnKC");
        setField(term409024, term409024.getClass(), "cmEventWatchedDate", "saLwGYNlZL");
        setField(term409024, term409024.getClass(), "firstGameId", "LxtgiQOODa");
        setField(term409024, term409024.getClass(), "firstRomVersion", "lxBZmEsOFA");
        setField(term409024, term409024.getClass(), "firstDataVersion", "iKmULNFZEo");
        setField(term409024, term409024.getClass(), "firstPlayDate", "CccYzzUgwl");
        setField(term409024, term409024.getClass(), "lastGameId", "hhfVxuZZGe");
        setField(term409024, term409024.getClass(), "lastRomVersion", "YKHEFUdabx");
        setField(term409024, term409024.getClass(), "lastDataVersion", "VTJbtbEZoq");
        setField(term409024, term409024.getClass(), "compatibleCmVersion", "XDYMCyroUT");
        setField(term409024, term409024.getClass(), "lastPlayDate", "igxBXNziFV");
        setIntField(term409024, term409024.getClass(), "lastPlaceId", -916485859);
        setField(term409024, term409024.getClass(), "lastPlaceName", "DjGFUIRCFL");
        setIntField(term409024, term409024.getClass(), "lastRegionId", -1751873139);
        setField(term409024, term409024.getClass(), "lastRegionName", "lElFzBdPIk");
        setIntField(term409024, term409024.getClass(), "lastAllNetId", -1149846145);
        setField(term409024, term409024.getClass(), "lastClientId", "lizxXSXllu");
        setIntField(term409024, term409024.getClass(), "lastUsedDeckId", -959113183);
        setIntField(term409024, term409024.getClass(), "lastPlayMusicLevel", 1058560990);
        setIntField(term409024, term409024.getClass(), "lastEmoneyBrand", 833857765);
        setField(term409022, term409022.getClass(), "user", term409024);
        setIntField(term409022, term409022.getClass(), "musicId", -1193406924);
        setIntField(term409022, term409022.getClass(), "level", -1996850297);
        setIntField(term409022, term409022.getClass(), "playCount", 1869101891);
        setIntField(term409022, term409022.getClass(), "techScoreMax", -1368279934);
        setIntField(term409022, term409022.getClass(), "techScoreRank", 1891898628);
        setIntField(term409022, term409022.getClass(), "battleScoreMax", -767577430);
        setIntField(term409022, term409022.getClass(), "battleScoreRank", -1162627321);
        setIntField(term409022, term409022.getClass(), "maxComboCount", -865081397);
        setIntField(term409022, term409022.getClass(), "maxOverKill", -1213297666);
        setIntField(term409022, term409022.getClass(), "maxTeamOverKill", 1229168714);
        setBooleanField(term409022, term409022.getClass(), "isFullBell", false);
        setBooleanField(term409022, term409022.getClass(), "isFullCombo", false);
        setBooleanField(term409022, term409022.getClass(), "isAllBreake", false);
        setBooleanField(term409022, term409022.getClass(), "isLock", false);
        setIntField(term409022, term409022.getClass(), "clearStatus", -1902237243);
        setBooleanField(term409022, term409022.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxTeamOverKill", argTypes, term409022, args);
    }

};


