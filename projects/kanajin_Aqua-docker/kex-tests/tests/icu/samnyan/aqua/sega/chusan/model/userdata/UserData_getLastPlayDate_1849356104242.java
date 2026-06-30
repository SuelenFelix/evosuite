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

public class UserData_getLastPlayDate_1849356104242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280208;

    public UserData_getLastPlayDate_1849356104242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280208 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term280208, term280208.getClass(), "id", 0L);
        setField(term280208, term280208.getClass(), "card", null);
        setField(term280208, term280208.getClass(), "userName", null);
        setIntField(term280208, term280208.getClass(), "level", 0);
        setIntField(term280208, term280208.getClass(), "reincarnationNum", 0);
        setField(term280208, term280208.getClass(), "exp", null);
        setLongField(term280208, term280208.getClass(), "point", 0L);
        setLongField(term280208, term280208.getClass(), "totalPoint", 0L);
        setIntField(term280208, term280208.getClass(), "playCount", 0);
        setIntField(term280208, term280208.getClass(), "multiPlayCount", 0);
        setIntField(term280208, term280208.getClass(), "playerRating", 0);
        setIntField(term280208, term280208.getClass(), "highestRating", 0);
        setIntField(term280208, term280208.getClass(), "nameplateId", 0);
        setIntField(term280208, term280208.getClass(), "frameId", 0);
        setIntField(term280208, term280208.getClass(), "characterId", 0);
        setIntField(term280208, term280208.getClass(), "trophyId", 0);
        setIntField(term280208, term280208.getClass(), "playedTutorialBit", 0);
        setIntField(term280208, term280208.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term280208, term280208.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term280208, term280208.getClass(), "totalMapNum", 0);
        setLongField(term280208, term280208.getClass(), "totalHiScore", 0L);
        setLongField(term280208, term280208.getClass(), "totalBasicHighScore", 0L);
        setLongField(term280208, term280208.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term280208, term280208.getClass(), "totalExpertHighScore", 0L);
        setLongField(term280208, term280208.getClass(), "totalMasterHighScore", 0L);
        setLongField(term280208, term280208.getClass(), "totalUltimaHighScore", 0L);
        setField(term280208, term280208.getClass(), "eventWatchedDate", null);
        setIntField(term280208, term280208.getClass(), "friendCount", 0);
        setField(term280208, term280208.getClass(), "firstGameId", null);
        setField(term280208, term280208.getClass(), "firstRomVersion", null);
        setField(term280208, term280208.getClass(), "firstDataVersion", null);
        setField(term280208, term280208.getClass(), "firstPlayDate", null);
        setField(term280208, term280208.getClass(), "lastGameId", null);
        setField(term280208, term280208.getClass(), "lastRomVersion", null);
        setField(term280208, term280208.getClass(), "lastDataVersion", null);
        setField(term280208, term280208.getClass(), "lastLoginDate", null);
        setField(term280208, term280208.getClass(), "lastPlayDate", null);
        setIntField(term280208, term280208.getClass(), "lastPlaceId", 0);
        setField(term280208, term280208.getClass(), "lastPlaceName", null);
        setField(term280208, term280208.getClass(), "lastRegionId", null);
        setField(term280208, term280208.getClass(), "lastRegionName", null);
        setField(term280208, term280208.getClass(), "lastAllNetId", null);
        setField(term280208, term280208.getClass(), "lastClientId", null);
        setField(term280208, term280208.getClass(), "lastCountryCode", null);
        setField(term280208, term280208.getClass(), "userNameEx", null);
        setField(term280208, term280208.getClass(), "compatibleCmVersion", null);
        setIntField(term280208, term280208.getClass(), "medal", 0);
        setIntField(term280208, term280208.getClass(), "mapIconId", 0);
        setIntField(term280208, term280208.getClass(), "voiceId", 0);
        setIntField(term280208, term280208.getClass(), "avatarWear", 0);
        setIntField(term280208, term280208.getClass(), "avatarHead", 0);
        setIntField(term280208, term280208.getClass(), "avatarFace", 0);
        setIntField(term280208, term280208.getClass(), "avatarSkin", 0);
        setIntField(term280208, term280208.getClass(), "avatarItem", 0);
        setIntField(term280208, term280208.getClass(), "avatarFront", 0);
        setIntField(term280208, term280208.getClass(), "avatarBack", 0);
        setIntField(term280208, term280208.getClass(), "classEmblemBase", 0);
        setIntField(term280208, term280208.getClass(), "classEmblemMedal", 0);
        setIntField(term280208, term280208.getClass(), "stockedGridCount", 0);
        setIntField(term280208, term280208.getClass(), "exMapLoopCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattlePlayCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattleWinCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattleLoseCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term280208, term280208.getClass(), "charaIllustId", 0);
        setIntField(term280208, term280208.getClass(), "skillId", 0);
        setIntField(term280208, term280208.getClass(), "overPowerPoint", 0);
        setIntField(term280208, term280208.getClass(), "overPowerRate", 0);
        setIntField(term280208, term280208.getClass(), "overPowerLowerRank", 0);
        setIntField(term280208, term280208.getClass(), "avatarPoint", 0);
        setIntField(term280208, term280208.getClass(), "battleRankId", 0);
        setIntField(term280208, term280208.getClass(), "battleRankPoint", 0);
        setIntField(term280208, term280208.getClass(), "eliteRankPoint", 0);
        setIntField(term280208, term280208.getClass(), "netBattle1stCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattle2ndCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattle3rdCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattle4thCount", 0);
        setIntField(term280208, term280208.getClass(), "netBattleCorrection", 0);
        setIntField(term280208, term280208.getClass(), "netBattleErrCnt", 0);
        setIntField(term280208, term280208.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term280208, term280208.getClass(), "battleRewardStatus", 0);
        setIntField(term280208, term280208.getClass(), "battleRewardIndex", 0);
        setIntField(term280208, term280208.getClass(), "battleRewardCount", 0);
        setIntField(term280208, term280208.getClass(), "ext1", 0);
        setIntField(term280208, term280208.getClass(), "ext2", 0);
        setIntField(term280208, term280208.getClass(), "ext3", 0);
        setIntField(term280208, term280208.getClass(), "ext4", 0);
        setIntField(term280208, term280208.getClass(), "ext5", 0);
        setIntField(term280208, term280208.getClass(), "ext6", 0);
        setIntField(term280208, term280208.getClass(), "ext7", 0);
        setIntField(term280208, term280208.getClass(), "ext8", 0);
        setIntField(term280208, term280208.getClass(), "ext9", 0);
        setIntField(term280208, term280208.getClass(), "ext10", 0);
        setField(term280208, term280208.getClass(), "extStr1", null);
        setField(term280208, term280208.getClass(), "extStr2", null);
        setLongField(term280208, term280208.getClass(), "extLong1", 0L);
        setLongField(term280208, term280208.getClass(), "extLong2", 0L);
        setField(term280208, term280208.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term280208, term280208.getClass(), "isNetBattleHost", false);
        setIntField(term280208, term280208.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term280208, args);
    }

};


