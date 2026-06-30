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

public class UserDetail_setWinCount_407491917129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4303190;
     Object term4303559;

    public UserDetail_setWinCount_407491917129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4303194 = new Long(-8828375492863660333L);
        Integer term4303257 = new Integer(1701541391);
        Integer term4303259 = new Integer(-936192688);
        Integer term4303261 = new Integer(938944057);
        Integer term4303263 = new Integer(855364273);
        Integer term4303265 = new Integer(-519539376);
        Integer term4303267 = new Integer(-651264831);
        ArrayList term4303255 = new ArrayList();
        ((ArrayList) term4303255).add(term4303257);
        ((ArrayList) term4303255).add(term4303259);
        ((ArrayList) term4303255).add(term4303261);
        ((ArrayList) term4303255).add(term4303263);
        ((ArrayList) term4303255).add(term4303265);
        ((ArrayList) term4303255).add(term4303267);
        Integer term4303273 = new Integer(801845409);
        Integer term4303275 = new Integer(-638292583);
        Integer term4303277 = new Integer(-1507192014);
        Integer term4303279 = new Integer(-444046395);
        Integer term4303281 = new Integer(-1931089223);
        Integer term4303283 = new Integer(-1614199178);
        Integer term4303285 = new Integer(8500819);
        Integer term4303287 = new Integer(-84115449);
        Integer term4303289 = new Integer(1974081733);
        ArrayList term4303271 = new ArrayList();
        ((ArrayList) term4303271).add(term4303273);
        ((ArrayList) term4303271).add(term4303275);
        ((ArrayList) term4303271).add(term4303277);
        ((ArrayList) term4303271).add(term4303279);
        ((ArrayList) term4303271).add(term4303281);
        ((ArrayList) term4303271).add(term4303283);
        ((ArrayList) term4303271).add(term4303285);
        ((ArrayList) term4303271).add(term4303287);
        ((ArrayList) term4303271).add(term4303289);
        term4303190 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4303192 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4303208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4303209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4303213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4303218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4303219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4303223 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4303190, term4303190.getClass(), "id", 7111821175863156013L);
        setLongField(term4303192, term4303192.getClass(), "id", 4275637867547003478L);
        setField(term4303192, term4303192.getClass(), "extId", term4303194);
        setField(term4303192, term4303192.getClass(), "luid", "DZMEVGepRK");
        setIntField(term4303209, term4303209.getClass(), "year", 2011);
        setShortField(term4303209, term4303209.getClass(), "month", (short) 1);
        setShortField(term4303209, term4303209.getClass(), "day", (short) 31);
        setField(term4303208, term4303208.getClass(), "date", term4303209);
        setByteField(term4303213, term4303213.getClass(), "hour", (byte) 0);
        setByteField(term4303213, term4303213.getClass(), "minute", (byte) 45);
        setByteField(term4303213, term4303213.getClass(), "second", (byte) 44);
        setIntField(term4303213, term4303213.getClass(), "nano", 948510356);
        setField(term4303208, term4303208.getClass(), "time", term4303213);
        setField(term4303192, term4303192.getClass(), "registerTime", term4303208);
        setIntField(term4303219, term4303219.getClass(), "year", 2029);
        setShortField(term4303219, term4303219.getClass(), "month", (short) 9);
        setShortField(term4303219, term4303219.getClass(), "day", (short) 15);
        setField(term4303218, term4303218.getClass(), "date", term4303219);
        setByteField(term4303223, term4303223.getClass(), "hour", (byte) 22);
        setByteField(term4303223, term4303223.getClass(), "minute", (byte) 59);
        setByteField(term4303223, term4303223.getClass(), "second", (byte) 41);
        setIntField(term4303223, term4303223.getClass(), "nano", 582434329);
        setField(term4303218, term4303218.getClass(), "time", term4303223);
        setField(term4303192, term4303192.getClass(), "accessTime", term4303218);
        setField(term4303190, term4303190.getClass(), "card", term4303192);
        setField(term4303190, term4303190.getClass(), "userName", "wNNAhpOhDg");
        setIntField(term4303190, term4303190.getClass(), "isNetMember", -1099048215);
        setIntField(term4303190, term4303190.getClass(), "iconId", 1086649977);
        setIntField(term4303190, term4303190.getClass(), "plateId", -453075362);
        setIntField(term4303190, term4303190.getClass(), "titleId", -1800802418);
        setIntField(term4303190, term4303190.getClass(), "partnerId", 1291891755);
        setIntField(term4303190, term4303190.getClass(), "frameId", -886189818);
        setIntField(term4303190, term4303190.getClass(), "selectMapId", -470931233);
        setIntField(term4303190, term4303190.getClass(), "totalAwake", -115604889);
        setIntField(term4303190, term4303190.getClass(), "gradeRating", -2030623279);
        setIntField(term4303190, term4303190.getClass(), "musicRating", -1670122708);
        setIntField(term4303190, term4303190.getClass(), "playerRating", -855748);
        setIntField(term4303190, term4303190.getClass(), "highestRating", 2071158453);
        setIntField(term4303190, term4303190.getClass(), "gradeRank", -1293543364);
        setIntField(term4303190, term4303190.getClass(), "classRank", -687895805);
        setIntField(term4303190, term4303190.getClass(), "courseRank", 457805848);
        setField(term4303190, term4303190.getClass(), "charaSlot", term4303255);
        setField(term4303190, term4303190.getClass(), "charaLockSlot", term4303271);
        setLongField(term4303190, term4303190.getClass(), "contentBit", -8267725451703926733L);
        setIntField(term4303190, term4303190.getClass(), "playCount", -1246795893);
        setField(term4303190, term4303190.getClass(), "eventWatchedDate", "HgXJrGxwNz");
        setField(term4303190, term4303190.getClass(), "lastGameId", "FYpDWCTbQf");
        setField(term4303190, term4303190.getClass(), "lastRomVersion", "FMZgGBlbiS");
        setField(term4303190, term4303190.getClass(), "lastDataVersion", "gbhWgJvPYB");
        setField(term4303190, term4303190.getClass(), "lastLoginDate", "WSjEwEOPmP");
        setField(term4303190, term4303190.getClass(), "lastPlayDate", "GiyReYKLBn");
        setIntField(term4303190, term4303190.getClass(), "lastPlayCredit", 411049590);
        setIntField(term4303190, term4303190.getClass(), "lastPlayMode", 1567778467);
        setIntField(term4303190, term4303190.getClass(), "lastPlaceId", 292308078);
        setField(term4303190, term4303190.getClass(), "lastPlaceName", "AJYUmukQme");
        setIntField(term4303190, term4303190.getClass(), "lastAllNetId", 1772749656);
        setIntField(term4303190, term4303190.getClass(), "lastRegionId", 1054363290);
        setField(term4303190, term4303190.getClass(), "lastRegionName", "vybLslNgUa");
        setField(term4303190, term4303190.getClass(), "lastClientId", "wnIKYnxeFu");
        setField(term4303190, term4303190.getClass(), "lastCountryCode", "cdqMMggPJq");
        setIntField(term4303190, term4303190.getClass(), "lastSelectEMoney", 820506289);
        setIntField(term4303190, term4303190.getClass(), "lastSelectTicket", -1411277679);
        setIntField(term4303190, term4303190.getClass(), "lastSelectCourse", -1331746143);
        setIntField(term4303190, term4303190.getClass(), "lastCountCourse", -1723876238);
        setField(term4303190, term4303190.getClass(), "firstGameId", "LMvGIQkdyg");
        setField(term4303190, term4303190.getClass(), "firstRomVersion", "PFfTSrWdDW");
        setField(term4303190, term4303190.getClass(), "firstDataVersion", "nljpixbPSy");
        setField(term4303190, term4303190.getClass(), "firstPlayDate", "RfjgTebzTJ");
        setField(term4303190, term4303190.getClass(), "compatibleCmVersion", "avoMoywtII");
        setField(term4303190, term4303190.getClass(), "dailyBonusDate", "bDkOPjEDfg");
        setField(term4303190, term4303190.getClass(), "dailyCourseBonusDate", "cnzjteJSbR");
        setField(term4303190, term4303190.getClass(), "lastPairLoginDate", "yuWNiMzSWg");
        setField(term4303190, term4303190.getClass(), "lastTrialPlayDate", "TWSyDLhjDu");
        setIntField(term4303190, term4303190.getClass(), "playVsCount", 1319220796);
        setIntField(term4303190, term4303190.getClass(), "playSyncCount", 2103323501);
        setIntField(term4303190, term4303190.getClass(), "winCount", -1542312464);
        setIntField(term4303190, term4303190.getClass(), "helpCount", -2102560159);
        setIntField(term4303190, term4303190.getClass(), "comboCount", -1236487223);
        setLongField(term4303190, term4303190.getClass(), "totalDeluxscore", -8960767984736863077L);
        setLongField(term4303190, term4303190.getClass(), "totalBasicDeluxscore", 5936658218174047491L);
        setLongField(term4303190, term4303190.getClass(), "totalAdvancedDeluxscore", -4113434842263429539L);
        setLongField(term4303190, term4303190.getClass(), "totalExpertDeluxscore", -8562223481156684587L);
        setLongField(term4303190, term4303190.getClass(), "totalMasterDeluxscore", -536905277300551464L);
        setLongField(term4303190, term4303190.getClass(), "totalReMasterDeluxscore", 6038094583920310539L);
        setIntField(term4303190, term4303190.getClass(), "totalSync", -1258959342);
        setIntField(term4303190, term4303190.getClass(), "totalBasicSync", 468510476);
        setIntField(term4303190, term4303190.getClass(), "totalAdvancedSync", -1423227773);
        setIntField(term4303190, term4303190.getClass(), "totalExpertSync", -1606912084);
        setIntField(term4303190, term4303190.getClass(), "totalMasterSync", -1143126669);
        setIntField(term4303190, term4303190.getClass(), "totalReMasterSync", -2101065367);
        setLongField(term4303190, term4303190.getClass(), "totalAchievement", 3785379525967121694L);
        setLongField(term4303190, term4303190.getClass(), "totalBasicAchievement", 3437778824525220761L);
        setLongField(term4303190, term4303190.getClass(), "totalAdvancedAchievement", 8967869518413473050L);
        setLongField(term4303190, term4303190.getClass(), "totalExpertAchievement", -5355933215431382623L);
        setLongField(term4303190, term4303190.getClass(), "totalMasterAchievement", -7473096230758657839L);
        setLongField(term4303190, term4303190.getClass(), "totalReMasterAchievement", -6485558096494801828L);
        setLongField(term4303190, term4303190.getClass(), "playerOldRating", -9072275602885096469L);
        setLongField(term4303190, term4303190.getClass(), "playerNewRating", 8620855704676068417L);
        setIntField(term4303190, term4303190.getClass(), "banState", -708888046);
        setLongField(term4303190, term4303190.getClass(), "dateTime", 679427927784261490L);
        term4303559 = new Integer(-157617255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4303559;
        callMethod(klass, "setWinCount", argTypes, term4303190, args);
    }

};


