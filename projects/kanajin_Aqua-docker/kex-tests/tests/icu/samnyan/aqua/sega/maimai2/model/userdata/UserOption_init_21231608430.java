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

public class UserOption_init_21231608430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498113;

    public UserOption_init_21231608430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term498117 = new Long(2823262561274956150L);
        ArrayList term498178 = new ArrayList();
        Integer term498184 = new Integer(1295906354);
        Integer term498186 = new Integer(980180400);
        Integer term498188 = new Integer(-128299328);
        ArrayList term498182 = new ArrayList();
        ((ArrayList) term498182).add(term498184);
        ((ArrayList) term498182).add(term498186);
        ((ArrayList) term498182).add(term498188);
        term498113 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term498115 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term498131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term498132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term498136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term498141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term498142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term498146 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term498113, term498113.getClass(), "id", 6776975096575362523L);
        setLongField(term498115, term498115.getClass(), "id", 6127024388514029159L);
        setField(term498115, term498115.getClass(), "extId", term498117);
        setField(term498115, term498115.getClass(), "luid", "KJppgEJBMj");
        setIntField(term498132, term498132.getClass(), "year", 2021);
        setShortField(term498132, term498132.getClass(), "month", (short) 10);
        setShortField(term498132, term498132.getClass(), "day", (short) 21);
        setField(term498131, term498131.getClass(), "date", term498132);
        setByteField(term498136, term498136.getClass(), "hour", (byte) 18);
        setByteField(term498136, term498136.getClass(), "minute", (byte) 13);
        setByteField(term498136, term498136.getClass(), "second", (byte) 5);
        setIntField(term498136, term498136.getClass(), "nano", 498696785);
        setField(term498131, term498131.getClass(), "time", term498136);
        setField(term498115, term498115.getClass(), "registerTime", term498131);
        setIntField(term498142, term498142.getClass(), "year", 2023);
        setShortField(term498142, term498142.getClass(), "month", (short) 10);
        setShortField(term498142, term498142.getClass(), "day", (short) 7);
        setField(term498141, term498141.getClass(), "date", term498142);
        setByteField(term498146, term498146.getClass(), "hour", (byte) 5);
        setByteField(term498146, term498146.getClass(), "minute", (byte) 55);
        setByteField(term498146, term498146.getClass(), "second", (byte) 51);
        setIntField(term498146, term498146.getClass(), "nano", 618539758);
        setField(term498141, term498141.getClass(), "time", term498146);
        setField(term498115, term498115.getClass(), "accessTime", term498141);
        setField(term498113, term498113.getClass(), "card", term498115);
        setField(term498113, term498113.getClass(), "userName", "iRfGqhOIVc");
        setIntField(term498113, term498113.getClass(), "isNetMember", -733273863);
        setIntField(term498113, term498113.getClass(), "iconId", -1633562782);
        setIntField(term498113, term498113.getClass(), "plateId", -1809452794);
        setIntField(term498113, term498113.getClass(), "titleId", -876403162);
        setIntField(term498113, term498113.getClass(), "partnerId", 122845529);
        setIntField(term498113, term498113.getClass(), "frameId", 1267982302);
        setIntField(term498113, term498113.getClass(), "selectMapId", 1848009929);
        setIntField(term498113, term498113.getClass(), "totalAwake", -2110844225);
        setIntField(term498113, term498113.getClass(), "gradeRating", 248914632);
        setIntField(term498113, term498113.getClass(), "musicRating", 1781081846);
        setIntField(term498113, term498113.getClass(), "playerRating", 1979991270);
        setIntField(term498113, term498113.getClass(), "highestRating", 395327046);
        setIntField(term498113, term498113.getClass(), "gradeRank", -1848503583);
        setIntField(term498113, term498113.getClass(), "classRank", 1866185228);
        setIntField(term498113, term498113.getClass(), "courseRank", 1064359652);
        setField(term498113, term498113.getClass(), "charaSlot", term498178);
        setField(term498113, term498113.getClass(), "charaLockSlot", term498182);
        setLongField(term498113, term498113.getClass(), "contentBit", 4096585780854382743L);
        setIntField(term498113, term498113.getClass(), "playCount", -1886213109);
        setField(term498113, term498113.getClass(), "eventWatchedDate", "vzaSeDleDE");
        setField(term498113, term498113.getClass(), "lastGameId", "yodwsvtHLh");
        setField(term498113, term498113.getClass(), "lastRomVersion", "dBZrYjMosI");
        setField(term498113, term498113.getClass(), "lastDataVersion", "VXkXsREWcp");
        setField(term498113, term498113.getClass(), "lastLoginDate", "TVCSLJWzbM");
        setField(term498113, term498113.getClass(), "lastPlayDate", "KKKxQUsfHu");
        setIntField(term498113, term498113.getClass(), "lastPlayCredit", 1561370594);
        setIntField(term498113, term498113.getClass(), "lastPlayMode", 440624626);
        setIntField(term498113, term498113.getClass(), "lastPlaceId", -1440649686);
        setField(term498113, term498113.getClass(), "lastPlaceName", "bHCMgjlKoF");
        setIntField(term498113, term498113.getClass(), "lastAllNetId", -1267391362);
        setIntField(term498113, term498113.getClass(), "lastRegionId", 199786162);
        setField(term498113, term498113.getClass(), "lastRegionName", "pQvwqAQDnY");
        setField(term498113, term498113.getClass(), "lastClientId", "uAnhyhvuhZ");
        setField(term498113, term498113.getClass(), "lastCountryCode", "JWfpkVbPeH");
        setIntField(term498113, term498113.getClass(), "lastSelectEMoney", -1541247332);
        setIntField(term498113, term498113.getClass(), "lastSelectTicket", -1792490591);
        setIntField(term498113, term498113.getClass(), "lastSelectCourse", -1140814332);
        setIntField(term498113, term498113.getClass(), "lastCountCourse", 1120804132);
        setField(term498113, term498113.getClass(), "firstGameId", "uNjHrzHDTX");
        setField(term498113, term498113.getClass(), "firstRomVersion", "PhOhMdKWyC");
        setField(term498113, term498113.getClass(), "firstDataVersion", "ZbxQrzzgSr");
        setField(term498113, term498113.getClass(), "firstPlayDate", "yMFOHVnIMN");
        setField(term498113, term498113.getClass(), "compatibleCmVersion", "tgOLItEryz");
        setField(term498113, term498113.getClass(), "dailyBonusDate", "xQvvsETFbe");
        setField(term498113, term498113.getClass(), "dailyCourseBonusDate", "HvZXCbuDzi");
        setField(term498113, term498113.getClass(), "lastPairLoginDate", "JQNnsCGeMS");
        setField(term498113, term498113.getClass(), "lastTrialPlayDate", "JOQkrTRvJu");
        setIntField(term498113, term498113.getClass(), "playVsCount", 1959925271);
        setIntField(term498113, term498113.getClass(), "playSyncCount", 1000055703);
        setIntField(term498113, term498113.getClass(), "winCount", -1273956595);
        setIntField(term498113, term498113.getClass(), "helpCount", -1557537667);
        setIntField(term498113, term498113.getClass(), "comboCount", -673440071);
        setLongField(term498113, term498113.getClass(), "totalDeluxscore", -1764012464441058205L);
        setLongField(term498113, term498113.getClass(), "totalBasicDeluxscore", 1741303457712223201L);
        setLongField(term498113, term498113.getClass(), "totalAdvancedDeluxscore", -6791410355952080019L);
        setLongField(term498113, term498113.getClass(), "totalExpertDeluxscore", 3008415788370974249L);
        setLongField(term498113, term498113.getClass(), "totalMasterDeluxscore", -8625448071885644543L);
        setLongField(term498113, term498113.getClass(), "totalReMasterDeluxscore", 1952563306981502613L);
        setIntField(term498113, term498113.getClass(), "totalSync", 1463293414);
        setIntField(term498113, term498113.getClass(), "totalBasicSync", -1425932954);
        setIntField(term498113, term498113.getClass(), "totalAdvancedSync", -419893197);
        setIntField(term498113, term498113.getClass(), "totalExpertSync", -1666335590);
        setIntField(term498113, term498113.getClass(), "totalMasterSync", 395600981);
        setIntField(term498113, term498113.getClass(), "totalReMasterSync", -895328565);
        setLongField(term498113, term498113.getClass(), "totalAchievement", 168067915956342963L);
        setLongField(term498113, term498113.getClass(), "totalBasicAchievement", -8259606580780981L);
        setLongField(term498113, term498113.getClass(), "totalAdvancedAchievement", 3063314603858615049L);
        setLongField(term498113, term498113.getClass(), "totalExpertAchievement", 8860503237438891503L);
        setLongField(term498113, term498113.getClass(), "totalMasterAchievement", 3230252887439226535L);
        setLongField(term498113, term498113.getClass(), "totalReMasterAchievement", -773071204004617878L);
        setLongField(term498113, term498113.getClass(), "playerOldRating", -6336114388808604755L);
        setLongField(term498113, term498113.getClass(), "playerNewRating", 3222185687256900589L);
        setIntField(term498113, term498113.getClass(), "banState", -824777481);
        setLongField(term498113, term498113.getClass(), "dateTime", 5057453109460343132L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term498113;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


