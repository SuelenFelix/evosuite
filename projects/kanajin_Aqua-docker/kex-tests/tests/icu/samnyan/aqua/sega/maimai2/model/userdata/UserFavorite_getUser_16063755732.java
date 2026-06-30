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

public class UserFavorite_getUser_16063755732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564396;

    public UserFavorite_getUser_16063755732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term564402 = new Long(5391189846186870864L);
        Integer term564465 = new Integer(-1536885597);
        Integer term564467 = new Integer(-1906904065);
        Integer term564469 = new Integer(-1325607039);
        Integer term564471 = new Integer(43806434);
        Integer term564473 = new Integer(1869537390);
        Integer term564475 = new Integer(-912321180);
        Integer term564477 = new Integer(332710777);
        Integer term564479 = new Integer(1307238592);
        ArrayList term564463 = new ArrayList();
        ((ArrayList) term564463).add(term564465);
        ((ArrayList) term564463).add(term564467);
        ((ArrayList) term564463).add(term564469);
        ((ArrayList) term564463).add(term564471);
        ((ArrayList) term564463).add(term564473);
        ((ArrayList) term564463).add(term564475);
        ((ArrayList) term564463).add(term564477);
        ((ArrayList) term564463).add(term564479);
        Integer term564485 = new Integer(1917900339);
        Integer term564487 = new Integer(-166475832);
        Integer term564489 = new Integer(-1426746104);
        ArrayList term564483 = new ArrayList();
        ((ArrayList) term564483).add(term564485);
        ((ArrayList) term564483).add(term564487);
        ((ArrayList) term564483).add(term564489);
        ArrayList term564761 = new ArrayList();
        term564396 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        Object term564398 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term564400 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term564416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term564417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term564421 = newInstance(Class.forName("java.time.LocalTime"));
        Object term564426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term564427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term564431 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term564396, term564396.getClass(), "id", 5593922452152830752L);
        setLongField(term564398, term564398.getClass(), "id", 7899706941490859524L);
        setLongField(term564400, term564400.getClass(), "id", -8580099945199402603L);
        setField(term564400, term564400.getClass(), "extId", term564402);
        setField(term564400, term564400.getClass(), "luid", "gXjLIjrrWh");
        setIntField(term564417, term564417.getClass(), "year", 2022);
        setShortField(term564417, term564417.getClass(), "month", (short) 6);
        setShortField(term564417, term564417.getClass(), "day", (short) 24);
        setField(term564416, term564416.getClass(), "date", term564417);
        setByteField(term564421, term564421.getClass(), "hour", (byte) 0);
        setByteField(term564421, term564421.getClass(), "minute", (byte) 49);
        setByteField(term564421, term564421.getClass(), "second", (byte) 35);
        setIntField(term564421, term564421.getClass(), "nano", 108272185);
        setField(term564416, term564416.getClass(), "time", term564421);
        setField(term564400, term564400.getClass(), "registerTime", term564416);
        setIntField(term564427, term564427.getClass(), "year", 2022);
        setShortField(term564427, term564427.getClass(), "month", (short) 4);
        setShortField(term564427, term564427.getClass(), "day", (short) 10);
        setField(term564426, term564426.getClass(), "date", term564427);
        setByteField(term564431, term564431.getClass(), "hour", (byte) 21);
        setByteField(term564431, term564431.getClass(), "minute", (byte) 19);
        setByteField(term564431, term564431.getClass(), "second", (byte) 36);
        setIntField(term564431, term564431.getClass(), "nano", 925743416);
        setField(term564426, term564426.getClass(), "time", term564431);
        setField(term564400, term564400.getClass(), "accessTime", term564426);
        setField(term564398, term564398.getClass(), "card", term564400);
        setField(term564398, term564398.getClass(), "userName", "pMEdUUGnHO");
        setIntField(term564398, term564398.getClass(), "isNetMember", -2037746718);
        setIntField(term564398, term564398.getClass(), "iconId", -775928993);
        setIntField(term564398, term564398.getClass(), "plateId", -1600795827);
        setIntField(term564398, term564398.getClass(), "titleId", 2003983884);
        setIntField(term564398, term564398.getClass(), "partnerId", -1886149990);
        setIntField(term564398, term564398.getClass(), "frameId", -123816507);
        setIntField(term564398, term564398.getClass(), "selectMapId", 125980083);
        setIntField(term564398, term564398.getClass(), "totalAwake", 1414307894);
        setIntField(term564398, term564398.getClass(), "gradeRating", -798767288);
        setIntField(term564398, term564398.getClass(), "musicRating", -1664570943);
        setIntField(term564398, term564398.getClass(), "playerRating", 1742384822);
        setIntField(term564398, term564398.getClass(), "highestRating", 49636463);
        setIntField(term564398, term564398.getClass(), "gradeRank", -881496611);
        setIntField(term564398, term564398.getClass(), "classRank", 2077343358);
        setIntField(term564398, term564398.getClass(), "courseRank", 777464531);
        setField(term564398, term564398.getClass(), "charaSlot", term564463);
        setField(term564398, term564398.getClass(), "charaLockSlot", term564483);
        setLongField(term564398, term564398.getClass(), "contentBit", 864488739547006766L);
        setIntField(term564398, term564398.getClass(), "playCount", -65004966);
        setField(term564398, term564398.getClass(), "eventWatchedDate", "rglkguiPxE");
        setField(term564398, term564398.getClass(), "lastGameId", "hplFGDxgfR");
        setField(term564398, term564398.getClass(), "lastRomVersion", "kFQCKPJQDy");
        setField(term564398, term564398.getClass(), "lastDataVersion", "GpUrCxRwHg");
        setField(term564398, term564398.getClass(), "lastLoginDate", "dixYrXNYqo");
        setField(term564398, term564398.getClass(), "lastPlayDate", "ahVvdSqaKT");
        setIntField(term564398, term564398.getClass(), "lastPlayCredit", -407908460);
        setIntField(term564398, term564398.getClass(), "lastPlayMode", 418032376);
        setIntField(term564398, term564398.getClass(), "lastPlaceId", -1184882144);
        setField(term564398, term564398.getClass(), "lastPlaceName", "QkrqqBMJHS");
        setIntField(term564398, term564398.getClass(), "lastAllNetId", -128638224);
        setIntField(term564398, term564398.getClass(), "lastRegionId", -189484641);
        setField(term564398, term564398.getClass(), "lastRegionName", "YIJfrIwdZb");
        setField(term564398, term564398.getClass(), "lastClientId", "IokWRyGwaH");
        setField(term564398, term564398.getClass(), "lastCountryCode", "nYVnOegiCp");
        setIntField(term564398, term564398.getClass(), "lastSelectEMoney", 2134925776);
        setIntField(term564398, term564398.getClass(), "lastSelectTicket", 1966133647);
        setIntField(term564398, term564398.getClass(), "lastSelectCourse", -539112848);
        setIntField(term564398, term564398.getClass(), "lastCountCourse", 1507527171);
        setField(term564398, term564398.getClass(), "firstGameId", "WWbtkUjUKL");
        setField(term564398, term564398.getClass(), "firstRomVersion", "xaOhctMhRk");
        setField(term564398, term564398.getClass(), "firstDataVersion", "BoXECcnWDI");
        setField(term564398, term564398.getClass(), "firstPlayDate", "pkOlSmqIRh");
        setField(term564398, term564398.getClass(), "compatibleCmVersion", "SgkSELfiCN");
        setField(term564398, term564398.getClass(), "dailyBonusDate", "BCYPvvqrrs");
        setField(term564398, term564398.getClass(), "dailyCourseBonusDate", "BZJrDPszsn");
        setField(term564398, term564398.getClass(), "lastPairLoginDate", "cSJlAITYRY");
        setField(term564398, term564398.getClass(), "lastTrialPlayDate", "XuyPJzqInD");
        setIntField(term564398, term564398.getClass(), "playVsCount", 755572319);
        setIntField(term564398, term564398.getClass(), "playSyncCount", 278256755);
        setIntField(term564398, term564398.getClass(), "winCount", -1390318188);
        setIntField(term564398, term564398.getClass(), "helpCount", -1959489857);
        setIntField(term564398, term564398.getClass(), "comboCount", 313306892);
        setLongField(term564398, term564398.getClass(), "totalDeluxscore", -3446503527429471213L);
        setLongField(term564398, term564398.getClass(), "totalBasicDeluxscore", -3205815592308661790L);
        setLongField(term564398, term564398.getClass(), "totalAdvancedDeluxscore", 6134043459472786374L);
        setLongField(term564398, term564398.getClass(), "totalExpertDeluxscore", -1195638569529934815L);
        setLongField(term564398, term564398.getClass(), "totalMasterDeluxscore", -5825287852400108916L);
        setLongField(term564398, term564398.getClass(), "totalReMasterDeluxscore", -6227134292661522342L);
        setIntField(term564398, term564398.getClass(), "totalSync", -1320392125);
        setIntField(term564398, term564398.getClass(), "totalBasicSync", -1768735227);
        setIntField(term564398, term564398.getClass(), "totalAdvancedSync", 893031220);
        setIntField(term564398, term564398.getClass(), "totalExpertSync", 1249284322);
        setIntField(term564398, term564398.getClass(), "totalMasterSync", -200352610);
        setIntField(term564398, term564398.getClass(), "totalReMasterSync", -1017947633);
        setLongField(term564398, term564398.getClass(), "totalAchievement", 7602242397981063679L);
        setLongField(term564398, term564398.getClass(), "totalBasicAchievement", -1655665584703519216L);
        setLongField(term564398, term564398.getClass(), "totalAdvancedAchievement", -7228032840033499469L);
        setLongField(term564398, term564398.getClass(), "totalExpertAchievement", 1452288808391411897L);
        setLongField(term564398, term564398.getClass(), "totalMasterAchievement", 2350819841719870396L);
        setLongField(term564398, term564398.getClass(), "totalReMasterAchievement", 2916178451081275625L);
        setLongField(term564398, term564398.getClass(), "playerOldRating", -655127474088988046L);
        setLongField(term564398, term564398.getClass(), "playerNewRating", 5248346604823071663L);
        setIntField(term564398, term564398.getClass(), "banState", -761210944);
        setLongField(term564398, term564398.getClass(), "dateTime", -7589901510592918921L);
        setField(term564396, term564396.getClass(), "user", term564398);
        setLongField(term564396, term564396.getClass(), "favUserId", 4282445911262407743L);
        setIntField(term564396, term564396.getClass(), "itemKind", -317345700);
        setField(term564396, term564396.getClass(), "itemIdList", term564761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term564396, args);
    }

};


