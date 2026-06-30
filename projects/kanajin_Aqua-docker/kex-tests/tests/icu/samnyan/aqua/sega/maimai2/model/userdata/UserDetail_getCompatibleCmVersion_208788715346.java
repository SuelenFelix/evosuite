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

public class UserDetail_getCompatibleCmVersion_208788715346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221090;

    public UserDetail_getCompatibleCmVersion_208788715346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term221094 = new Long(6351887424140565471L);
        Integer term221157 = new Integer(280068573);
        Integer term221159 = new Integer(-1081530515);
        Integer term221161 = new Integer(492096339);
        Integer term221163 = new Integer(-1679827671);
        Integer term221165 = new Integer(932019255);
        Integer term221167 = new Integer(1939661233);
        Integer term221169 = new Integer(-485147289);
        Integer term221171 = new Integer(-1098526777);
        Integer term221173 = new Integer(871491464);
        ArrayList term221155 = new ArrayList();
        ((ArrayList) term221155).add(term221157);
        ((ArrayList) term221155).add(term221159);
        ((ArrayList) term221155).add(term221161);
        ((ArrayList) term221155).add(term221163);
        ((ArrayList) term221155).add(term221165);
        ((ArrayList) term221155).add(term221167);
        ((ArrayList) term221155).add(term221169);
        ((ArrayList) term221155).add(term221171);
        ((ArrayList) term221155).add(term221173);
        Integer term221179 = new Integer(1250354269);
        Integer term221181 = new Integer(695748317);
        Integer term221183 = new Integer(-439470959);
        Integer term221185 = new Integer(-248472453);
        Integer term221187 = new Integer(1056759659);
        ArrayList term221177 = new ArrayList();
        ((ArrayList) term221177).add(term221179);
        ((ArrayList) term221177).add(term221181);
        ((ArrayList) term221177).add(term221183);
        ((ArrayList) term221177).add(term221185);
        ((ArrayList) term221177).add(term221187);
        term221090 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term221092 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term221108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221113 = newInstance(Class.forName("java.time.LocalTime"));
        Object term221118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221123 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term221090, term221090.getClass(), "id", 4377184190248737508L);
        setLongField(term221092, term221092.getClass(), "id", -4743830380585824129L);
        setField(term221092, term221092.getClass(), "extId", term221094);
        setField(term221092, term221092.getClass(), "luid", "MrjCdvTPnq");
        setIntField(term221109, term221109.getClass(), "year", 2014);
        setShortField(term221109, term221109.getClass(), "month", (short) 2);
        setShortField(term221109, term221109.getClass(), "day", (short) 2);
        setField(term221108, term221108.getClass(), "date", term221109);
        setByteField(term221113, term221113.getClass(), "hour", (byte) 17);
        setByteField(term221113, term221113.getClass(), "minute", (byte) 45);
        setByteField(term221113, term221113.getClass(), "second", (byte) 37);
        setIntField(term221113, term221113.getClass(), "nano", 147840174);
        setField(term221108, term221108.getClass(), "time", term221113);
        setField(term221092, term221092.getClass(), "registerTime", term221108);
        setIntField(term221119, term221119.getClass(), "year", 2023);
        setShortField(term221119, term221119.getClass(), "month", (short) 4);
        setShortField(term221119, term221119.getClass(), "day", (short) 27);
        setField(term221118, term221118.getClass(), "date", term221119);
        setByteField(term221123, term221123.getClass(), "hour", (byte) 11);
        setByteField(term221123, term221123.getClass(), "minute", (byte) 41);
        setByteField(term221123, term221123.getClass(), "second", (byte) 10);
        setIntField(term221123, term221123.getClass(), "nano", 59265345);
        setField(term221118, term221118.getClass(), "time", term221123);
        setField(term221092, term221092.getClass(), "accessTime", term221118);
        setField(term221090, term221090.getClass(), "card", term221092);
        setField(term221090, term221090.getClass(), "userName", "fheVosxidN");
        setIntField(term221090, term221090.getClass(), "isNetMember", -1566042472);
        setIntField(term221090, term221090.getClass(), "iconId", 654568310);
        setIntField(term221090, term221090.getClass(), "plateId", 1379492509);
        setIntField(term221090, term221090.getClass(), "titleId", 1859663828);
        setIntField(term221090, term221090.getClass(), "partnerId", -241347649);
        setIntField(term221090, term221090.getClass(), "frameId", -996032013);
        setIntField(term221090, term221090.getClass(), "selectMapId", -499780226);
        setIntField(term221090, term221090.getClass(), "totalAwake", -2047034320);
        setIntField(term221090, term221090.getClass(), "gradeRating", 229323589);
        setIntField(term221090, term221090.getClass(), "musicRating", 608950067);
        setIntField(term221090, term221090.getClass(), "playerRating", -1976530324);
        setIntField(term221090, term221090.getClass(), "highestRating", -345508496);
        setIntField(term221090, term221090.getClass(), "gradeRank", 1836772931);
        setIntField(term221090, term221090.getClass(), "classRank", 1471156136);
        setIntField(term221090, term221090.getClass(), "courseRank", 869271750);
        setField(term221090, term221090.getClass(), "charaSlot", term221155);
        setField(term221090, term221090.getClass(), "charaLockSlot", term221177);
        setLongField(term221090, term221090.getClass(), "contentBit", 9068898375463638986L);
        setIntField(term221090, term221090.getClass(), "playCount", -891906508);
        setField(term221090, term221090.getClass(), "eventWatchedDate", "EliOjzcjaH");
        setField(term221090, term221090.getClass(), "lastGameId", "QebYNbOBeP");
        setField(term221090, term221090.getClass(), "lastRomVersion", "azqpHmPbfX");
        setField(term221090, term221090.getClass(), "lastDataVersion", "mzjGFHNpPh");
        setField(term221090, term221090.getClass(), "lastLoginDate", "JmuvhLuzoo");
        setField(term221090, term221090.getClass(), "lastPlayDate", "yunXHVjiFz");
        setIntField(term221090, term221090.getClass(), "lastPlayCredit", 33200561);
        setIntField(term221090, term221090.getClass(), "lastPlayMode", -391675562);
        setIntField(term221090, term221090.getClass(), "lastPlaceId", 206061309);
        setField(term221090, term221090.getClass(), "lastPlaceName", "fInyTanaRj");
        setIntField(term221090, term221090.getClass(), "lastAllNetId", -469486858);
        setIntField(term221090, term221090.getClass(), "lastRegionId", -1184776933);
        setField(term221090, term221090.getClass(), "lastRegionName", "vUkEfrLXZa");
        setField(term221090, term221090.getClass(), "lastClientId", "SqXFUOzCDt");
        setField(term221090, term221090.getClass(), "lastCountryCode", "sPJdROPLoS");
        setIntField(term221090, term221090.getClass(), "lastSelectEMoney", -947890577);
        setIntField(term221090, term221090.getClass(), "lastSelectTicket", -2103526812);
        setIntField(term221090, term221090.getClass(), "lastSelectCourse", 2001968974);
        setIntField(term221090, term221090.getClass(), "lastCountCourse", 2036080787);
        setField(term221090, term221090.getClass(), "firstGameId", "BjNKZeUpZK");
        setField(term221090, term221090.getClass(), "firstRomVersion", "GUNfUXiXry");
        setField(term221090, term221090.getClass(), "firstDataVersion", "GHokIWCLXI");
        setField(term221090, term221090.getClass(), "firstPlayDate", "zgzHXWMKZV");
        setField(term221090, term221090.getClass(), "compatibleCmVersion", "wytMnhStpX");
        setField(term221090, term221090.getClass(), "dailyBonusDate", "hSBhOxKOgt");
        setField(term221090, term221090.getClass(), "dailyCourseBonusDate", "UNhbUArssD");
        setField(term221090, term221090.getClass(), "lastPairLoginDate", "KpyICcvyZe");
        setField(term221090, term221090.getClass(), "lastTrialPlayDate", "hmrbHaufRb");
        setIntField(term221090, term221090.getClass(), "playVsCount", -1187989955);
        setIntField(term221090, term221090.getClass(), "playSyncCount", 1522845770);
        setIntField(term221090, term221090.getClass(), "winCount", 457792368);
        setIntField(term221090, term221090.getClass(), "helpCount", 1883178473);
        setIntField(term221090, term221090.getClass(), "comboCount", -1873487804);
        setLongField(term221090, term221090.getClass(), "totalDeluxscore", -1325957388046326118L);
        setLongField(term221090, term221090.getClass(), "totalBasicDeluxscore", -4103900596755497991L);
        setLongField(term221090, term221090.getClass(), "totalAdvancedDeluxscore", -6476245452312735980L);
        setLongField(term221090, term221090.getClass(), "totalExpertDeluxscore", 4872695929657126219L);
        setLongField(term221090, term221090.getClass(), "totalMasterDeluxscore", 6798904122821331479L);
        setLongField(term221090, term221090.getClass(), "totalReMasterDeluxscore", -1359566511307790428L);
        setIntField(term221090, term221090.getClass(), "totalSync", 338162762);
        setIntField(term221090, term221090.getClass(), "totalBasicSync", -2029988360);
        setIntField(term221090, term221090.getClass(), "totalAdvancedSync", 985415961);
        setIntField(term221090, term221090.getClass(), "totalExpertSync", 1163437479);
        setIntField(term221090, term221090.getClass(), "totalMasterSync", 446404576);
        setIntField(term221090, term221090.getClass(), "totalReMasterSync", -250771991);
        setLongField(term221090, term221090.getClass(), "totalAchievement", -2145376871585702573L);
        setLongField(term221090, term221090.getClass(), "totalBasicAchievement", -6831828368646215302L);
        setLongField(term221090, term221090.getClass(), "totalAdvancedAchievement", 603470447927590435L);
        setLongField(term221090, term221090.getClass(), "totalExpertAchievement", 5563689140460528791L);
        setLongField(term221090, term221090.getClass(), "totalMasterAchievement", -6807100124632008206L);
        setLongField(term221090, term221090.getClass(), "totalReMasterAchievement", 1852487610612905757L);
        setLongField(term221090, term221090.getClass(), "playerOldRating", 1975113384225423579L);
        setLongField(term221090, term221090.getClass(), "playerNewRating", 179641543976710347L);
        setIntField(term221090, term221090.getClass(), "banState", -87432188);
        setLongField(term221090, term221090.getClass(), "dateTime", 1213540058509375119L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompatibleCmVersion", argTypes, term221090, args);
    }

};


