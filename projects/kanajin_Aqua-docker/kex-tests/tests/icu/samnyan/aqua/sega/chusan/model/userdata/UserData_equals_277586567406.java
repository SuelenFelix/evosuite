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

public class UserData_equals_277586567406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292988;

    public UserData_equals_277586567406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292988 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292988, term292988.getClass(), "id", 0L);
        setField(term292988, term292988.getClass(), "card", null);
        setField(term292988, term292988.getClass(), "userName", null);
        setIntField(term292988, term292988.getClass(), "level", 0);
        setIntField(term292988, term292988.getClass(), "reincarnationNum", 0);
        setField(term292988, term292988.getClass(), "exp", null);
        setLongField(term292988, term292988.getClass(), "point", 0L);
        setLongField(term292988, term292988.getClass(), "totalPoint", 0L);
        setIntField(term292988, term292988.getClass(), "playCount", 0);
        setIntField(term292988, term292988.getClass(), "multiPlayCount", 0);
        setIntField(term292988, term292988.getClass(), "playerRating", 0);
        setIntField(term292988, term292988.getClass(), "highestRating", 0);
        setIntField(term292988, term292988.getClass(), "nameplateId", 0);
        setIntField(term292988, term292988.getClass(), "frameId", 0);
        setIntField(term292988, term292988.getClass(), "characterId", 0);
        setIntField(term292988, term292988.getClass(), "trophyId", 0);
        setIntField(term292988, term292988.getClass(), "playedTutorialBit", 0);
        setIntField(term292988, term292988.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292988, term292988.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292988, term292988.getClass(), "totalMapNum", 0);
        setLongField(term292988, term292988.getClass(), "totalHiScore", 0L);
        setLongField(term292988, term292988.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292988, term292988.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292988, term292988.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292988, term292988.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292988, term292988.getClass(), "totalUltimaHighScore", 0L);
        setField(term292988, term292988.getClass(), "eventWatchedDate", null);
        setIntField(term292988, term292988.getClass(), "friendCount", 0);
        setField(term292988, term292988.getClass(), "firstGameId", null);
        setField(term292988, term292988.getClass(), "firstRomVersion", null);
        setField(term292988, term292988.getClass(), "firstDataVersion", null);
        setField(term292988, term292988.getClass(), "firstPlayDate", null);
        setField(term292988, term292988.getClass(), "lastGameId", null);
        setField(term292988, term292988.getClass(), "lastRomVersion", null);
        setField(term292988, term292988.getClass(), "lastDataVersion", null);
        setField(term292988, term292988.getClass(), "lastLoginDate", null);
        setField(term292988, term292988.getClass(), "lastPlayDate", null);
        setIntField(term292988, term292988.getClass(), "lastPlaceId", 0);
        setField(term292988, term292988.getClass(), "lastPlaceName", null);
        setField(term292988, term292988.getClass(), "lastRegionId", null);
        setField(term292988, term292988.getClass(), "lastRegionName", null);
        setField(term292988, term292988.getClass(), "lastAllNetId", null);
        setField(term292988, term292988.getClass(), "lastClientId", null);
        setField(term292988, term292988.getClass(), "lastCountryCode", null);
        setField(term292988, term292988.getClass(), "userNameEx", null);
        setField(term292988, term292988.getClass(), "compatibleCmVersion", null);
        setIntField(term292988, term292988.getClass(), "medal", 0);
        setIntField(term292988, term292988.getClass(), "mapIconId", 0);
        setIntField(term292988, term292988.getClass(), "voiceId", 0);
        setIntField(term292988, term292988.getClass(), "avatarWear", 0);
        setIntField(term292988, term292988.getClass(), "avatarHead", 0);
        setIntField(term292988, term292988.getClass(), "avatarFace", 0);
        setIntField(term292988, term292988.getClass(), "avatarSkin", 0);
        setIntField(term292988, term292988.getClass(), "avatarItem", 0);
        setIntField(term292988, term292988.getClass(), "avatarFront", 0);
        setIntField(term292988, term292988.getClass(), "avatarBack", 0);
        setIntField(term292988, term292988.getClass(), "classEmblemBase", 0);
        setIntField(term292988, term292988.getClass(), "classEmblemMedal", 0);
        setIntField(term292988, term292988.getClass(), "stockedGridCount", 0);
        setIntField(term292988, term292988.getClass(), "exMapLoopCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattlePlayCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattleWinCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattleLoseCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292988, term292988.getClass(), "charaIllustId", 0);
        setIntField(term292988, term292988.getClass(), "skillId", 0);
        setIntField(term292988, term292988.getClass(), "overPowerPoint", 0);
        setIntField(term292988, term292988.getClass(), "overPowerRate", 0);
        setIntField(term292988, term292988.getClass(), "overPowerLowerRank", 0);
        setIntField(term292988, term292988.getClass(), "avatarPoint", 0);
        setIntField(term292988, term292988.getClass(), "battleRankId", 0);
        setIntField(term292988, term292988.getClass(), "battleRankPoint", 0);
        setIntField(term292988, term292988.getClass(), "eliteRankPoint", 0);
        setIntField(term292988, term292988.getClass(), "netBattle1stCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattle2ndCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattle3rdCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattle4thCount", 0);
        setIntField(term292988, term292988.getClass(), "netBattleCorrection", 0);
        setIntField(term292988, term292988.getClass(), "netBattleErrCnt", 0);
        setIntField(term292988, term292988.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292988, term292988.getClass(), "battleRewardStatus", 0);
        setIntField(term292988, term292988.getClass(), "battleRewardIndex", 0);
        setIntField(term292988, term292988.getClass(), "battleRewardCount", 0);
        setIntField(term292988, term292988.getClass(), "ext1", 0);
        setIntField(term292988, term292988.getClass(), "ext2", 0);
        setIntField(term292988, term292988.getClass(), "ext3", 0);
        setIntField(term292988, term292988.getClass(), "ext4", 0);
        setIntField(term292988, term292988.getClass(), "ext5", 0);
        setIntField(term292988, term292988.getClass(), "ext6", 0);
        setIntField(term292988, term292988.getClass(), "ext7", 0);
        setIntField(term292988, term292988.getClass(), "ext8", 0);
        setIntField(term292988, term292988.getClass(), "ext9", 0);
        setIntField(term292988, term292988.getClass(), "ext10", 0);
        setField(term292988, term292988.getClass(), "extStr1", null);
        setField(term292988, term292988.getClass(), "extStr2", null);
        setLongField(term292988, term292988.getClass(), "extLong1", 0L);
        setLongField(term292988, term292988.getClass(), "extLong2", 0L);
        setField(term292988, term292988.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292988, term292988.getClass(), "isNetBattleHost", false);
        setIntField(term292988, term292988.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term292988, args);
    }

};


