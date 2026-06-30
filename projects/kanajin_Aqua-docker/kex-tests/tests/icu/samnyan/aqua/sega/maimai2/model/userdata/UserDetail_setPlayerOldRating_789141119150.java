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

public class UserDetail_setPlayerOldRating_789141119150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4315155;
     Object term4315512;

    public UserDetail_setPlayerOldRating_789141119150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4315159 = new Long(7862186299051476140L);
        Integer term4315222 = new Integer(-1558614690);
        Integer term4315224 = new Integer(-1007231272);
        ArrayList term4315220 = new ArrayList();
        ((ArrayList) term4315220).add(term4315222);
        ((ArrayList) term4315220).add(term4315224);
        Integer term4315230 = new Integer(616194988);
        Integer term4315232 = new Integer(875212303);
        Integer term4315234 = new Integer(-1724746051);
        Integer term4315236 = new Integer(-1978836967);
        Integer term4315238 = new Integer(223766580);
        Integer term4315240 = new Integer(-1028401307);
        Integer term4315242 = new Integer(-749032967);
        ArrayList term4315228 = new ArrayList();
        ((ArrayList) term4315228).add(term4315230);
        ((ArrayList) term4315228).add(term4315232);
        ((ArrayList) term4315228).add(term4315234);
        ((ArrayList) term4315228).add(term4315236);
        ((ArrayList) term4315228).add(term4315238);
        ((ArrayList) term4315228).add(term4315240);
        ((ArrayList) term4315228).add(term4315242);
        term4315155 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4315157 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4315173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4315174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4315178 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4315183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4315184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4315188 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4315155, term4315155.getClass(), "id", 5551876124466250775L);
        setLongField(term4315157, term4315157.getClass(), "id", 3078920759381102296L);
        setField(term4315157, term4315157.getClass(), "extId", term4315159);
        setField(term4315157, term4315157.getClass(), "luid", "jVjpkTSzMZ");
        setIntField(term4315174, term4315174.getClass(), "year", 2018);
        setShortField(term4315174, term4315174.getClass(), "month", (short) 9);
        setShortField(term4315174, term4315174.getClass(), "day", (short) 10);
        setField(term4315173, term4315173.getClass(), "date", term4315174);
        setByteField(term4315178, term4315178.getClass(), "hour", (byte) 17);
        setByteField(term4315178, term4315178.getClass(), "minute", (byte) 23);
        setByteField(term4315178, term4315178.getClass(), "second", (byte) 32);
        setIntField(term4315178, term4315178.getClass(), "nano", 154111802);
        setField(term4315173, term4315173.getClass(), "time", term4315178);
        setField(term4315157, term4315157.getClass(), "registerTime", term4315173);
        setIntField(term4315184, term4315184.getClass(), "year", 2024);
        setShortField(term4315184, term4315184.getClass(), "month", (short) 3);
        setShortField(term4315184, term4315184.getClass(), "day", (short) 1);
        setField(term4315183, term4315183.getClass(), "date", term4315184);
        setByteField(term4315188, term4315188.getClass(), "hour", (byte) 4);
        setByteField(term4315188, term4315188.getClass(), "minute", (byte) 42);
        setByteField(term4315188, term4315188.getClass(), "second", (byte) 34);
        setIntField(term4315188, term4315188.getClass(), "nano", 812093151);
        setField(term4315183, term4315183.getClass(), "time", term4315188);
        setField(term4315157, term4315157.getClass(), "accessTime", term4315183);
        setField(term4315155, term4315155.getClass(), "card", term4315157);
        setField(term4315155, term4315155.getClass(), "userName", "siQLqVyByI");
        setIntField(term4315155, term4315155.getClass(), "isNetMember", 252377073);
        setIntField(term4315155, term4315155.getClass(), "iconId", 524516253);
        setIntField(term4315155, term4315155.getClass(), "plateId", 154085856);
        setIntField(term4315155, term4315155.getClass(), "titleId", 115774208);
        setIntField(term4315155, term4315155.getClass(), "partnerId", -117741133);
        setIntField(term4315155, term4315155.getClass(), "frameId", 1618887684);
        setIntField(term4315155, term4315155.getClass(), "selectMapId", -1347004648);
        setIntField(term4315155, term4315155.getClass(), "totalAwake", -76244174);
        setIntField(term4315155, term4315155.getClass(), "gradeRating", -227987846);
        setIntField(term4315155, term4315155.getClass(), "musicRating", -1257220512);
        setIntField(term4315155, term4315155.getClass(), "playerRating", -1561305815);
        setIntField(term4315155, term4315155.getClass(), "highestRating", 755844718);
        setIntField(term4315155, term4315155.getClass(), "gradeRank", 1076739333);
        setIntField(term4315155, term4315155.getClass(), "classRank", 274340967);
        setIntField(term4315155, term4315155.getClass(), "courseRank", -1695293088);
        setField(term4315155, term4315155.getClass(), "charaSlot", term4315220);
        setField(term4315155, term4315155.getClass(), "charaLockSlot", term4315228);
        setLongField(term4315155, term4315155.getClass(), "contentBit", -2221993669997639977L);
        setIntField(term4315155, term4315155.getClass(), "playCount", 1933610614);
        setField(term4315155, term4315155.getClass(), "eventWatchedDate", "yUaPPSGyQj");
        setField(term4315155, term4315155.getClass(), "lastGameId", "lBbWQdinXy");
        setField(term4315155, term4315155.getClass(), "lastRomVersion", "DvFYrnTdiH");
        setField(term4315155, term4315155.getClass(), "lastDataVersion", "QBBqwgoinZ");
        setField(term4315155, term4315155.getClass(), "lastLoginDate", "vNRNYvZUAo");
        setField(term4315155, term4315155.getClass(), "lastPlayDate", "TXsDPuusQV");
        setIntField(term4315155, term4315155.getClass(), "lastPlayCredit", 1273322230);
        setIntField(term4315155, term4315155.getClass(), "lastPlayMode", -59103104);
        setIntField(term4315155, term4315155.getClass(), "lastPlaceId", 309022503);
        setField(term4315155, term4315155.getClass(), "lastPlaceName", "RvdmBmfPtZ");
        setIntField(term4315155, term4315155.getClass(), "lastAllNetId", 1642853743);
        setIntField(term4315155, term4315155.getClass(), "lastRegionId", -1545748775);
        setField(term4315155, term4315155.getClass(), "lastRegionName", "cHQSkXWfnl");
        setField(term4315155, term4315155.getClass(), "lastClientId", "whfNmiogev");
        setField(term4315155, term4315155.getClass(), "lastCountryCode", "NOLcpFbMUI");
        setIntField(term4315155, term4315155.getClass(), "lastSelectEMoney", -869807758);
        setIntField(term4315155, term4315155.getClass(), "lastSelectTicket", 592016299);
        setIntField(term4315155, term4315155.getClass(), "lastSelectCourse", 958800564);
        setIntField(term4315155, term4315155.getClass(), "lastCountCourse", 1019104868);
        setField(term4315155, term4315155.getClass(), "firstGameId", "FyJynWBfVj");
        setField(term4315155, term4315155.getClass(), "firstRomVersion", "qhUFulqSiy");
        setField(term4315155, term4315155.getClass(), "firstDataVersion", "pSzrfTwMqM");
        setField(term4315155, term4315155.getClass(), "firstPlayDate", "KhdmtXEWFN");
        setField(term4315155, term4315155.getClass(), "compatibleCmVersion", "MqehvqMRTD");
        setField(term4315155, term4315155.getClass(), "dailyBonusDate", "qLpCqkOAWA");
        setField(term4315155, term4315155.getClass(), "dailyCourseBonusDate", "KbakBdmeng");
        setField(term4315155, term4315155.getClass(), "lastPairLoginDate", "DiYhWWhrSE");
        setField(term4315155, term4315155.getClass(), "lastTrialPlayDate", "acMoRsUpIC");
        setIntField(term4315155, term4315155.getClass(), "playVsCount", 368485726);
        setIntField(term4315155, term4315155.getClass(), "playSyncCount", 817475519);
        setIntField(term4315155, term4315155.getClass(), "winCount", -1014564634);
        setIntField(term4315155, term4315155.getClass(), "helpCount", -1937801984);
        setIntField(term4315155, term4315155.getClass(), "comboCount", 138711023);
        setLongField(term4315155, term4315155.getClass(), "totalDeluxscore", -5212495691266568893L);
        setLongField(term4315155, term4315155.getClass(), "totalBasicDeluxscore", -6456518236146374319L);
        setLongField(term4315155, term4315155.getClass(), "totalAdvancedDeluxscore", 1142753948543313662L);
        setLongField(term4315155, term4315155.getClass(), "totalExpertDeluxscore", -6126721666219131944L);
        setLongField(term4315155, term4315155.getClass(), "totalMasterDeluxscore", 5929750542250218176L);
        setLongField(term4315155, term4315155.getClass(), "totalReMasterDeluxscore", 6792173638735515094L);
        setIntField(term4315155, term4315155.getClass(), "totalSync", -507059201);
        setIntField(term4315155, term4315155.getClass(), "totalBasicSync", -258836153);
        setIntField(term4315155, term4315155.getClass(), "totalAdvancedSync", -1147466104);
        setIntField(term4315155, term4315155.getClass(), "totalExpertSync", 997330895);
        setIntField(term4315155, term4315155.getClass(), "totalMasterSync", 172129080);
        setIntField(term4315155, term4315155.getClass(), "totalReMasterSync", -560068536);
        setLongField(term4315155, term4315155.getClass(), "totalAchievement", -1408819816744794656L);
        setLongField(term4315155, term4315155.getClass(), "totalBasicAchievement", -8597618201307701009L);
        setLongField(term4315155, term4315155.getClass(), "totalAdvancedAchievement", -8931421679310334441L);
        setLongField(term4315155, term4315155.getClass(), "totalExpertAchievement", -3967480723522065818L);
        setLongField(term4315155, term4315155.getClass(), "totalMasterAchievement", 1295282110019597193L);
        setLongField(term4315155, term4315155.getClass(), "totalReMasterAchievement", -5345998212724914496L);
        setLongField(term4315155, term4315155.getClass(), "playerOldRating", -1444032184929485050L);
        setLongField(term4315155, term4315155.getClass(), "playerNewRating", -3015283000495307866L);
        setIntField(term4315155, term4315155.getClass(), "banState", 1740063311);
        setLongField(term4315155, term4315155.getClass(), "dateTime", 2007974770531106956L);
        term4315512 = new Long(6273563871370535951L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4315512;
        callMethod(klass, "setPlayerOldRating", argTypes, term4315155, args);
    }

};


