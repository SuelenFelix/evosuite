package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserFavorite_init_2211492300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563258;

    public UserFavorite_init_2211492300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term563262 = new Long(-7503147844796296300L);
        ArrayList term563323 = new ArrayList();
        Integer term563329 = new Integer(2110976760);
        ArrayList term563327 = new ArrayList();
        ((ArrayList) term563327).add(term563329);
        term563258 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term563260 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term563276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term563277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term563281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term563286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term563287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term563291 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term563258, term563258.getClass(), "id", -4270346751025842746L);
        setLongField(term563260, term563260.getClass(), "id", -4836097327214573237L);
        setField(term563260, term563260.getClass(), "extId", term563262);
        setField(term563260, term563260.getClass(), "luid", "tSolydYeQA");
        setIntField(term563277, term563277.getClass(), "year", 2024);
        setShortField(term563277, term563277.getClass(), "month", (short) 1);
        setShortField(term563277, term563277.getClass(), "day", (short) 26);
        setField(term563276, term563276.getClass(), "date", term563277);
        setByteField(term563281, term563281.getClass(), "hour", (byte) 6);
        setByteField(term563281, term563281.getClass(), "minute", (byte) 5);
        setByteField(term563281, term563281.getClass(), "second", (byte) 50);
        setIntField(term563281, term563281.getClass(), "nano", 91187229);
        setField(term563276, term563276.getClass(), "time", term563281);
        setField(term563260, term563260.getClass(), "registerTime", term563276);
        setIntField(term563287, term563287.getClass(), "year", 2024);
        setShortField(term563287, term563287.getClass(), "month", (short) 10);
        setShortField(term563287, term563287.getClass(), "day", (short) 12);
        setField(term563286, term563286.getClass(), "date", term563287);
        setByteField(term563291, term563291.getClass(), "hour", (byte) 13);
        setByteField(term563291, term563291.getClass(), "minute", (byte) 30);
        setByteField(term563291, term563291.getClass(), "second", (byte) 37);
        setIntField(term563291, term563291.getClass(), "nano", 903074102);
        setField(term563286, term563286.getClass(), "time", term563291);
        setField(term563260, term563260.getClass(), "accessTime", term563286);
        setField(term563258, term563258.getClass(), "card", term563260);
        setField(term563258, term563258.getClass(), "userName", "IfOkvpHXyF");
        setIntField(term563258, term563258.getClass(), "isNetMember", 469447264);
        setIntField(term563258, term563258.getClass(), "iconId", 469505481);
        setIntField(term563258, term563258.getClass(), "plateId", -325295774);
        setIntField(term563258, term563258.getClass(), "titleId", 1881096413);
        setIntField(term563258, term563258.getClass(), "partnerId", 1285539933);
        setIntField(term563258, term563258.getClass(), "frameId", -557956933);
        setIntField(term563258, term563258.getClass(), "selectMapId", -1691007519);
        setIntField(term563258, term563258.getClass(), "totalAwake", 1629435174);
        setIntField(term563258, term563258.getClass(), "gradeRating", -1303284365);
        setIntField(term563258, term563258.getClass(), "musicRating", 80594283);
        setIntField(term563258, term563258.getClass(), "playerRating", 2116258587);
        setIntField(term563258, term563258.getClass(), "highestRating", -722010167);
        setIntField(term563258, term563258.getClass(), "gradeRank", -1844717285);
        setIntField(term563258, term563258.getClass(), "classRank", 871242755);
        setIntField(term563258, term563258.getClass(), "courseRank", 853402655);
        setField(term563258, term563258.getClass(), "charaSlot", term563323);
        setField(term563258, term563258.getClass(), "charaLockSlot", term563327);
        setLongField(term563258, term563258.getClass(), "contentBit", 1184759307758060660L);
        setIntField(term563258, term563258.getClass(), "playCount", -776600637);
        setField(term563258, term563258.getClass(), "eventWatchedDate", "ExolszRFMD");
        setField(term563258, term563258.getClass(), "lastGameId", "eOlitgmuhg");
        setField(term563258, term563258.getClass(), "lastRomVersion", "PhytKbHpiU");
        setField(term563258, term563258.getClass(), "lastDataVersion", "gUCxasOVOI");
        setField(term563258, term563258.getClass(), "lastLoginDate", "lVPKtCYNgT");
        setField(term563258, term563258.getClass(), "lastPlayDate", "mcTNCtKbEy");
        setIntField(term563258, term563258.getClass(), "lastPlayCredit", 546338662);
        setIntField(term563258, term563258.getClass(), "lastPlayMode", 1536829367);
        setIntField(term563258, term563258.getClass(), "lastPlaceId", 317430195);
        setField(term563258, term563258.getClass(), "lastPlaceName", "TTpelgHaJu");
        setIntField(term563258, term563258.getClass(), "lastAllNetId", -2056452461);
        setIntField(term563258, term563258.getClass(), "lastRegionId", 1493132556);
        setField(term563258, term563258.getClass(), "lastRegionName", "DuzvuacIFV");
        setField(term563258, term563258.getClass(), "lastClientId", "LgMtbaNvcj");
        setField(term563258, term563258.getClass(), "lastCountryCode", "nWamqHPMib");
        setIntField(term563258, term563258.getClass(), "lastSelectEMoney", 957313870);
        setIntField(term563258, term563258.getClass(), "lastSelectTicket", -960764280);
        setIntField(term563258, term563258.getClass(), "lastSelectCourse", 1621568100);
        setIntField(term563258, term563258.getClass(), "lastCountCourse", -1002037053);
        setField(term563258, term563258.getClass(), "firstGameId", "TMtcyjJzjO");
        setField(term563258, term563258.getClass(), "firstRomVersion", "zbRctzYAHm");
        setField(term563258, term563258.getClass(), "firstDataVersion", "tYLsmzmity");
        setField(term563258, term563258.getClass(), "firstPlayDate", "TXMxrtzevL");
        setField(term563258, term563258.getClass(), "compatibleCmVersion", "FjfJYobqtJ");
        setField(term563258, term563258.getClass(), "dailyBonusDate", "cbJWkAbWzj");
        setField(term563258, term563258.getClass(), "dailyCourseBonusDate", "GpPiWwTKcU");
        setField(term563258, term563258.getClass(), "lastPairLoginDate", "ofjXUHewlG");
        setField(term563258, term563258.getClass(), "lastTrialPlayDate", "CHXNYgOymZ");
        setIntField(term563258, term563258.getClass(), "playVsCount", 171061728);
        setIntField(term563258, term563258.getClass(), "playSyncCount", -166042961);
        setIntField(term563258, term563258.getClass(), "winCount", 2004215409);
        setIntField(term563258, term563258.getClass(), "helpCount", 1083321813);
        setIntField(term563258, term563258.getClass(), "comboCount", 1219102689);
        setLongField(term563258, term563258.getClass(), "totalDeluxscore", -172482138262118092L);
        setLongField(term563258, term563258.getClass(), "totalBasicDeluxscore", -629067870467878737L);
        setLongField(term563258, term563258.getClass(), "totalAdvancedDeluxscore", -7521167073944594148L);
        setLongField(term563258, term563258.getClass(), "totalExpertDeluxscore", 7099215093809959611L);
        setLongField(term563258, term563258.getClass(), "totalMasterDeluxscore", -6341550327468498929L);
        setLongField(term563258, term563258.getClass(), "totalReMasterDeluxscore", 6461832933295160770L);
        setIntField(term563258, term563258.getClass(), "totalSync", -1749405109);
        setIntField(term563258, term563258.getClass(), "totalBasicSync", -1852202588);
        setIntField(term563258, term563258.getClass(), "totalAdvancedSync", 616186860);
        setIntField(term563258, term563258.getClass(), "totalExpertSync", 773054557);
        setIntField(term563258, term563258.getClass(), "totalMasterSync", -1833374840);
        setIntField(term563258, term563258.getClass(), "totalReMasterSync", 516346752);
        setLongField(term563258, term563258.getClass(), "totalAchievement", -4764213717705121575L);
        setLongField(term563258, term563258.getClass(), "totalBasicAchievement", -962275560811569636L);
        setLongField(term563258, term563258.getClass(), "totalAdvancedAchievement", -3747412138537774100L);
        setLongField(term563258, term563258.getClass(), "totalExpertAchievement", 5518521720274556881L);
        setLongField(term563258, term563258.getClass(), "totalMasterAchievement", 8586755154401053574L);
        setLongField(term563258, term563258.getClass(), "totalReMasterAchievement", -5465208798392120997L);
        setLongField(term563258, term563258.getClass(), "playerOldRating", -1304349481930269165L);
        setLongField(term563258, term563258.getClass(), "playerNewRating", -1749964107528530257L);
        setIntField(term563258, term563258.getClass(), "banState", 1735010352);
        setLongField(term563258, term563258.getClass(), "dateTime", -8384799548101242161L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term563258;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


