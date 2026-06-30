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
import java.lang.Integer;

public class UserData_setMedal_750807484352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288728;
     Object term288805;

    public UserData_setMedal_750807484352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288728 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288728, term288728.getClass(), "id", 0L);
        setField(term288728, term288728.getClass(), "card", null);
        setField(term288728, term288728.getClass(), "userName", null);
        setIntField(term288728, term288728.getClass(), "level", 0);
        setIntField(term288728, term288728.getClass(), "reincarnationNum", 0);
        setField(term288728, term288728.getClass(), "exp", null);
        setLongField(term288728, term288728.getClass(), "point", 0L);
        setLongField(term288728, term288728.getClass(), "totalPoint", 0L);
        setIntField(term288728, term288728.getClass(), "playCount", 0);
        setIntField(term288728, term288728.getClass(), "multiPlayCount", 0);
        setIntField(term288728, term288728.getClass(), "playerRating", 0);
        setIntField(term288728, term288728.getClass(), "highestRating", 0);
        setIntField(term288728, term288728.getClass(), "nameplateId", 0);
        setIntField(term288728, term288728.getClass(), "frameId", 0);
        setIntField(term288728, term288728.getClass(), "characterId", 0);
        setIntField(term288728, term288728.getClass(), "trophyId", 0);
        setIntField(term288728, term288728.getClass(), "playedTutorialBit", 0);
        setIntField(term288728, term288728.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288728, term288728.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288728, term288728.getClass(), "totalMapNum", 0);
        setLongField(term288728, term288728.getClass(), "totalHiScore", 0L);
        setLongField(term288728, term288728.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288728, term288728.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288728, term288728.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288728, term288728.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288728, term288728.getClass(), "totalUltimaHighScore", 0L);
        setField(term288728, term288728.getClass(), "eventWatchedDate", null);
        setIntField(term288728, term288728.getClass(), "friendCount", 0);
        setField(term288728, term288728.getClass(), "firstGameId", null);
        setField(term288728, term288728.getClass(), "firstRomVersion", null);
        setField(term288728, term288728.getClass(), "firstDataVersion", null);
        setField(term288728, term288728.getClass(), "firstPlayDate", null);
        setField(term288728, term288728.getClass(), "lastGameId", null);
        setField(term288728, term288728.getClass(), "lastRomVersion", null);
        setField(term288728, term288728.getClass(), "lastDataVersion", null);
        setField(term288728, term288728.getClass(), "lastLoginDate", null);
        setField(term288728, term288728.getClass(), "lastPlayDate", null);
        setIntField(term288728, term288728.getClass(), "lastPlaceId", 0);
        setField(term288728, term288728.getClass(), "lastPlaceName", null);
        setField(term288728, term288728.getClass(), "lastRegionId", null);
        setField(term288728, term288728.getClass(), "lastRegionName", null);
        setField(term288728, term288728.getClass(), "lastAllNetId", null);
        setField(term288728, term288728.getClass(), "lastClientId", null);
        setField(term288728, term288728.getClass(), "lastCountryCode", null);
        setField(term288728, term288728.getClass(), "userNameEx", null);
        setField(term288728, term288728.getClass(), "compatibleCmVersion", null);
        setIntField(term288728, term288728.getClass(), "medal", 0);
        setIntField(term288728, term288728.getClass(), "mapIconId", 0);
        setIntField(term288728, term288728.getClass(), "voiceId", 0);
        setIntField(term288728, term288728.getClass(), "avatarWear", 0);
        setIntField(term288728, term288728.getClass(), "avatarHead", 0);
        setIntField(term288728, term288728.getClass(), "avatarFace", 0);
        setIntField(term288728, term288728.getClass(), "avatarSkin", 0);
        setIntField(term288728, term288728.getClass(), "avatarItem", 0);
        setIntField(term288728, term288728.getClass(), "avatarFront", 0);
        setIntField(term288728, term288728.getClass(), "avatarBack", 0);
        setIntField(term288728, term288728.getClass(), "classEmblemBase", 0);
        setIntField(term288728, term288728.getClass(), "classEmblemMedal", 0);
        setIntField(term288728, term288728.getClass(), "stockedGridCount", 0);
        setIntField(term288728, term288728.getClass(), "exMapLoopCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattlePlayCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattleWinCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattleLoseCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288728, term288728.getClass(), "charaIllustId", 0);
        setIntField(term288728, term288728.getClass(), "skillId", 0);
        setIntField(term288728, term288728.getClass(), "overPowerPoint", 0);
        setIntField(term288728, term288728.getClass(), "overPowerRate", 0);
        setIntField(term288728, term288728.getClass(), "overPowerLowerRank", 0);
        setIntField(term288728, term288728.getClass(), "avatarPoint", 0);
        setIntField(term288728, term288728.getClass(), "battleRankId", 0);
        setIntField(term288728, term288728.getClass(), "battleRankPoint", 0);
        setIntField(term288728, term288728.getClass(), "eliteRankPoint", 0);
        setIntField(term288728, term288728.getClass(), "netBattle1stCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattle2ndCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattle3rdCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattle4thCount", 0);
        setIntField(term288728, term288728.getClass(), "netBattleCorrection", 0);
        setIntField(term288728, term288728.getClass(), "netBattleErrCnt", 0);
        setIntField(term288728, term288728.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288728, term288728.getClass(), "battleRewardStatus", 0);
        setIntField(term288728, term288728.getClass(), "battleRewardIndex", 0);
        setIntField(term288728, term288728.getClass(), "battleRewardCount", 0);
        setIntField(term288728, term288728.getClass(), "ext1", 0);
        setIntField(term288728, term288728.getClass(), "ext2", 0);
        setIntField(term288728, term288728.getClass(), "ext3", 0);
        setIntField(term288728, term288728.getClass(), "ext4", 0);
        setIntField(term288728, term288728.getClass(), "ext5", 0);
        setIntField(term288728, term288728.getClass(), "ext6", 0);
        setIntField(term288728, term288728.getClass(), "ext7", 0);
        setIntField(term288728, term288728.getClass(), "ext8", 0);
        setIntField(term288728, term288728.getClass(), "ext9", 0);
        setIntField(term288728, term288728.getClass(), "ext10", 0);
        setField(term288728, term288728.getClass(), "extStr1", null);
        setField(term288728, term288728.getClass(), "extStr2", null);
        setLongField(term288728, term288728.getClass(), "extLong1", 0L);
        setLongField(term288728, term288728.getClass(), "extLong2", 0L);
        setField(term288728, term288728.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288728, term288728.getClass(), "isNetBattleHost", false);
        setIntField(term288728, term288728.getClass(), "netBattleEndState", 0);
        term288805 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term288805;
        callMethod(klass, "setMedal", argTypes, term288728, args);
    }

};


