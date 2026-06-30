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

public class UserDetail_getLastCountCourse_170573573840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4252204;

    public UserDetail_getLastCountCourse_170573573840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4252208 = new Long(4816799479368554284L);
        Integer term4252271 = new Integer(115447081);
        Integer term4252273 = new Integer(-1256761775);
        Integer term4252275 = new Integer(-203447420);
        Integer term4252277 = new Integer(-1006644586);
        ArrayList term4252269 = new ArrayList();
        ((ArrayList) term4252269).add(term4252271);
        ((ArrayList) term4252269).add(term4252273);
        ((ArrayList) term4252269).add(term4252275);
        ((ArrayList) term4252269).add(term4252277);
        Integer term4252283 = new Integer(-1509130004);
        Integer term4252285 = new Integer(2130734848);
        Integer term4252287 = new Integer(1166123699);
        ArrayList term4252281 = new ArrayList();
        ((ArrayList) term4252281).add(term4252283);
        ((ArrayList) term4252281).add(term4252285);
        ((ArrayList) term4252281).add(term4252287);
        term4252204 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4252206 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4252222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4252223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4252227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4252232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4252233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4252237 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4252204, term4252204.getClass(), "id", 3037693717928377396L);
        setLongField(term4252206, term4252206.getClass(), "id", 3024851746515865377L);
        setField(term4252206, term4252206.getClass(), "extId", term4252208);
        setField(term4252206, term4252206.getClass(), "luid", "FHsrlstRzi");
        setIntField(term4252223, term4252223.getClass(), "year", 2029);
        setShortField(term4252223, term4252223.getClass(), "month", (short) 4);
        setShortField(term4252223, term4252223.getClass(), "day", (short) 21);
        setField(term4252222, term4252222.getClass(), "date", term4252223);
        setByteField(term4252227, term4252227.getClass(), "hour", (byte) 14);
        setByteField(term4252227, term4252227.getClass(), "minute", (byte) 57);
        setByteField(term4252227, term4252227.getClass(), "second", (byte) 34);
        setIntField(term4252227, term4252227.getClass(), "nano", 197002782);
        setField(term4252222, term4252222.getClass(), "time", term4252227);
        setField(term4252206, term4252206.getClass(), "registerTime", term4252222);
        setIntField(term4252233, term4252233.getClass(), "year", 2024);
        setShortField(term4252233, term4252233.getClass(), "month", (short) 6);
        setShortField(term4252233, term4252233.getClass(), "day", (short) 14);
        setField(term4252232, term4252232.getClass(), "date", term4252233);
        setByteField(term4252237, term4252237.getClass(), "hour", (byte) 10);
        setByteField(term4252237, term4252237.getClass(), "minute", (byte) 4);
        setByteField(term4252237, term4252237.getClass(), "second", (byte) 26);
        setIntField(term4252237, term4252237.getClass(), "nano", 885403034);
        setField(term4252232, term4252232.getClass(), "time", term4252237);
        setField(term4252206, term4252206.getClass(), "accessTime", term4252232);
        setField(term4252204, term4252204.getClass(), "card", term4252206);
        setField(term4252204, term4252204.getClass(), "userName", "ymEtqTAYTa");
        setIntField(term4252204, term4252204.getClass(), "isNetMember", -2128504983);
        setIntField(term4252204, term4252204.getClass(), "iconId", -321178527);
        setIntField(term4252204, term4252204.getClass(), "plateId", -994536578);
        setIntField(term4252204, term4252204.getClass(), "titleId", -300954335);
        setIntField(term4252204, term4252204.getClass(), "partnerId", 1154375913);
        setIntField(term4252204, term4252204.getClass(), "frameId", -375346850);
        setIntField(term4252204, term4252204.getClass(), "selectMapId", 352665067);
        setIntField(term4252204, term4252204.getClass(), "totalAwake", 1433731249);
        setIntField(term4252204, term4252204.getClass(), "gradeRating", 298372187);
        setIntField(term4252204, term4252204.getClass(), "musicRating", 142301449);
        setIntField(term4252204, term4252204.getClass(), "playerRating", -1401444307);
        setIntField(term4252204, term4252204.getClass(), "highestRating", -575139335);
        setIntField(term4252204, term4252204.getClass(), "gradeRank", 1863307018);
        setIntField(term4252204, term4252204.getClass(), "classRank", -1933978757);
        setIntField(term4252204, term4252204.getClass(), "courseRank", -183710906);
        setField(term4252204, term4252204.getClass(), "charaSlot", term4252269);
        setField(term4252204, term4252204.getClass(), "charaLockSlot", term4252281);
        setLongField(term4252204, term4252204.getClass(), "contentBit", -3933313486437696745L);
        setIntField(term4252204, term4252204.getClass(), "playCount", 1352304234);
        setField(term4252204, term4252204.getClass(), "eventWatchedDate", "CeNVhkNKPQ");
        setField(term4252204, term4252204.getClass(), "lastGameId", "ipUHscKEAc");
        setField(term4252204, term4252204.getClass(), "lastRomVersion", "dQtuyKcdwT");
        setField(term4252204, term4252204.getClass(), "lastDataVersion", "AgzIChBCjT");
        setField(term4252204, term4252204.getClass(), "lastLoginDate", "QDwJzDmjNd");
        setField(term4252204, term4252204.getClass(), "lastPlayDate", "caKueaDRIH");
        setIntField(term4252204, term4252204.getClass(), "lastPlayCredit", 45162225);
        setIntField(term4252204, term4252204.getClass(), "lastPlayMode", -1410999760);
        setIntField(term4252204, term4252204.getClass(), "lastPlaceId", 1093509077);
        setField(term4252204, term4252204.getClass(), "lastPlaceName", "mJomQBxlYL");
        setIntField(term4252204, term4252204.getClass(), "lastAllNetId", -653583743);
        setIntField(term4252204, term4252204.getClass(), "lastRegionId", -1231395935);
        setField(term4252204, term4252204.getClass(), "lastRegionName", "BqmDhOQgIB");
        setField(term4252204, term4252204.getClass(), "lastClientId", "MnLCbfFgKO");
        setField(term4252204, term4252204.getClass(), "lastCountryCode", "gFMuOMEmNa");
        setIntField(term4252204, term4252204.getClass(), "lastSelectEMoney", -151844577);
        setIntField(term4252204, term4252204.getClass(), "lastSelectTicket", -1226501226);
        setIntField(term4252204, term4252204.getClass(), "lastSelectCourse", 1902371572);
        setIntField(term4252204, term4252204.getClass(), "lastCountCourse", 785518951);
        setField(term4252204, term4252204.getClass(), "firstGameId", "lEeBHDFJsV");
        setField(term4252204, term4252204.getClass(), "firstRomVersion", "AMxjGNQOyG");
        setField(term4252204, term4252204.getClass(), "firstDataVersion", "MOdeXSESXG");
        setField(term4252204, term4252204.getClass(), "firstPlayDate", "jErdwWyfkF");
        setField(term4252204, term4252204.getClass(), "compatibleCmVersion", "cUlCQPUGNG");
        setField(term4252204, term4252204.getClass(), "dailyBonusDate", "KOYDuKfYiE");
        setField(term4252204, term4252204.getClass(), "dailyCourseBonusDate", "mdTSMeSsAn");
        setField(term4252204, term4252204.getClass(), "lastPairLoginDate", "ZrensJreuS");
        setField(term4252204, term4252204.getClass(), "lastTrialPlayDate", "KcAaSbMWtN");
        setIntField(term4252204, term4252204.getClass(), "playVsCount", 42368266);
        setIntField(term4252204, term4252204.getClass(), "playSyncCount", -2092870865);
        setIntField(term4252204, term4252204.getClass(), "winCount", 617401639);
        setIntField(term4252204, term4252204.getClass(), "helpCount", 583029421);
        setIntField(term4252204, term4252204.getClass(), "comboCount", -857601258);
        setLongField(term4252204, term4252204.getClass(), "totalDeluxscore", -1914875679714655757L);
        setLongField(term4252204, term4252204.getClass(), "totalBasicDeluxscore", 8329336507463674575L);
        setLongField(term4252204, term4252204.getClass(), "totalAdvancedDeluxscore", -6778113265805155946L);
        setLongField(term4252204, term4252204.getClass(), "totalExpertDeluxscore", -1570887818762336980L);
        setLongField(term4252204, term4252204.getClass(), "totalMasterDeluxscore", 1739368210893376596L);
        setLongField(term4252204, term4252204.getClass(), "totalReMasterDeluxscore", -3980704689132582457L);
        setIntField(term4252204, term4252204.getClass(), "totalSync", 668560424);
        setIntField(term4252204, term4252204.getClass(), "totalBasicSync", -194956571);
        setIntField(term4252204, term4252204.getClass(), "totalAdvancedSync", -221076576);
        setIntField(term4252204, term4252204.getClass(), "totalExpertSync", 630381982);
        setIntField(term4252204, term4252204.getClass(), "totalMasterSync", -327382213);
        setIntField(term4252204, term4252204.getClass(), "totalReMasterSync", 258897228);
        setLongField(term4252204, term4252204.getClass(), "totalAchievement", 4184338038772863510L);
        setLongField(term4252204, term4252204.getClass(), "totalBasicAchievement", 7287346077303630406L);
        setLongField(term4252204, term4252204.getClass(), "totalAdvancedAchievement", -6367261200330324914L);
        setLongField(term4252204, term4252204.getClass(), "totalExpertAchievement", 5308716112275928798L);
        setLongField(term4252204, term4252204.getClass(), "totalMasterAchievement", -5720566866220490730L);
        setLongField(term4252204, term4252204.getClass(), "totalReMasterAchievement", 112454379176349465L);
        setLongField(term4252204, term4252204.getClass(), "playerOldRating", 4887659301837256345L);
        setLongField(term4252204, term4252204.getClass(), "playerNewRating", 1855777239470349017L);
        setIntField(term4252204, term4252204.getClass(), "banState", 1263207443);
        setLongField(term4252204, term4252204.getClass(), "dateTime", -3762857559885072462L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountCourse", argTypes, term4252204, args);
    }

};


