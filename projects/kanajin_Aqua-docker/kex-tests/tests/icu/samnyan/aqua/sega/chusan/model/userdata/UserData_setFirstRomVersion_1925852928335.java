package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_setFirstRomVersion_1925852928335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287417;

    public UserData_setFirstRomVersion_1925852928335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287417 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term287417, term287417.getClass(), "id", 0L);
        setField(term287417, term287417.getClass(), "card", null);
        setField(term287417, term287417.getClass(), "userName", null);
        setIntField(term287417, term287417.getClass(), "level", 0);
        setIntField(term287417, term287417.getClass(), "reincarnationNum", 0);
        setField(term287417, term287417.getClass(), "exp", null);
        setLongField(term287417, term287417.getClass(), "point", 0L);
        setLongField(term287417, term287417.getClass(), "totalPoint", 0L);
        setIntField(term287417, term287417.getClass(), "playCount", 0);
        setIntField(term287417, term287417.getClass(), "multiPlayCount", 0);
        setIntField(term287417, term287417.getClass(), "playerRating", 0);
        setIntField(term287417, term287417.getClass(), "highestRating", 0);
        setIntField(term287417, term287417.getClass(), "nameplateId", 0);
        setIntField(term287417, term287417.getClass(), "frameId", 0);
        setIntField(term287417, term287417.getClass(), "characterId", 0);
        setIntField(term287417, term287417.getClass(), "trophyId", 0);
        setIntField(term287417, term287417.getClass(), "playedTutorialBit", 0);
        setIntField(term287417, term287417.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term287417, term287417.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term287417, term287417.getClass(), "totalMapNum", 0);
        setLongField(term287417, term287417.getClass(), "totalHiScore", 0L);
        setLongField(term287417, term287417.getClass(), "totalBasicHighScore", 0L);
        setLongField(term287417, term287417.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term287417, term287417.getClass(), "totalExpertHighScore", 0L);
        setLongField(term287417, term287417.getClass(), "totalMasterHighScore", 0L);
        setLongField(term287417, term287417.getClass(), "totalUltimaHighScore", 0L);
        setField(term287417, term287417.getClass(), "eventWatchedDate", null);
        setIntField(term287417, term287417.getClass(), "friendCount", 0);
        setField(term287417, term287417.getClass(), "firstGameId", null);
        setField(term287417, term287417.getClass(), "firstRomVersion", null);
        setField(term287417, term287417.getClass(), "firstDataVersion", null);
        setField(term287417, term287417.getClass(), "firstPlayDate", null);
        setField(term287417, term287417.getClass(), "lastGameId", null);
        setField(term287417, term287417.getClass(), "lastRomVersion", null);
        setField(term287417, term287417.getClass(), "lastDataVersion", null);
        setField(term287417, term287417.getClass(), "lastLoginDate", null);
        setField(term287417, term287417.getClass(), "lastPlayDate", null);
        setIntField(term287417, term287417.getClass(), "lastPlaceId", 0);
        setField(term287417, term287417.getClass(), "lastPlaceName", null);
        setField(term287417, term287417.getClass(), "lastRegionId", null);
        setField(term287417, term287417.getClass(), "lastRegionName", null);
        setField(term287417, term287417.getClass(), "lastAllNetId", null);
        setField(term287417, term287417.getClass(), "lastClientId", null);
        setField(term287417, term287417.getClass(), "lastCountryCode", null);
        setField(term287417, term287417.getClass(), "userNameEx", null);
        setField(term287417, term287417.getClass(), "compatibleCmVersion", null);
        setIntField(term287417, term287417.getClass(), "medal", 0);
        setIntField(term287417, term287417.getClass(), "mapIconId", 0);
        setIntField(term287417, term287417.getClass(), "voiceId", 0);
        setIntField(term287417, term287417.getClass(), "avatarWear", 0);
        setIntField(term287417, term287417.getClass(), "avatarHead", 0);
        setIntField(term287417, term287417.getClass(), "avatarFace", 0);
        setIntField(term287417, term287417.getClass(), "avatarSkin", 0);
        setIntField(term287417, term287417.getClass(), "avatarItem", 0);
        setIntField(term287417, term287417.getClass(), "avatarFront", 0);
        setIntField(term287417, term287417.getClass(), "avatarBack", 0);
        setIntField(term287417, term287417.getClass(), "classEmblemBase", 0);
        setIntField(term287417, term287417.getClass(), "classEmblemMedal", 0);
        setIntField(term287417, term287417.getClass(), "stockedGridCount", 0);
        setIntField(term287417, term287417.getClass(), "exMapLoopCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattlePlayCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattleWinCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattleLoseCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term287417, term287417.getClass(), "charaIllustId", 0);
        setIntField(term287417, term287417.getClass(), "skillId", 0);
        setIntField(term287417, term287417.getClass(), "overPowerPoint", 0);
        setIntField(term287417, term287417.getClass(), "overPowerRate", 0);
        setIntField(term287417, term287417.getClass(), "overPowerLowerRank", 0);
        setIntField(term287417, term287417.getClass(), "avatarPoint", 0);
        setIntField(term287417, term287417.getClass(), "battleRankId", 0);
        setIntField(term287417, term287417.getClass(), "battleRankPoint", 0);
        setIntField(term287417, term287417.getClass(), "eliteRankPoint", 0);
        setIntField(term287417, term287417.getClass(), "netBattle1stCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattle2ndCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattle3rdCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattle4thCount", 0);
        setIntField(term287417, term287417.getClass(), "netBattleCorrection", 0);
        setIntField(term287417, term287417.getClass(), "netBattleErrCnt", 0);
        setIntField(term287417, term287417.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term287417, term287417.getClass(), "battleRewardStatus", 0);
        setIntField(term287417, term287417.getClass(), "battleRewardIndex", 0);
        setIntField(term287417, term287417.getClass(), "battleRewardCount", 0);
        setIntField(term287417, term287417.getClass(), "ext1", 0);
        setIntField(term287417, term287417.getClass(), "ext2", 0);
        setIntField(term287417, term287417.getClass(), "ext3", 0);
        setIntField(term287417, term287417.getClass(), "ext4", 0);
        setIntField(term287417, term287417.getClass(), "ext5", 0);
        setIntField(term287417, term287417.getClass(), "ext6", 0);
        setIntField(term287417, term287417.getClass(), "ext7", 0);
        setIntField(term287417, term287417.getClass(), "ext8", 0);
        setIntField(term287417, term287417.getClass(), "ext9", 0);
        setIntField(term287417, term287417.getClass(), "ext10", 0);
        setField(term287417, term287417.getClass(), "extStr1", null);
        setField(term287417, term287417.getClass(), "extStr2", null);
        setLongField(term287417, term287417.getClass(), "extLong1", 0L);
        setLongField(term287417, term287417.getClass(), "extLong2", 0L);
        setField(term287417, term287417.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term287417, term287417.getClass(), "isNetBattleHost", false);
        setIntField(term287417, term287417.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstRomVersion", argTypes, term287417, args);
    }

};


