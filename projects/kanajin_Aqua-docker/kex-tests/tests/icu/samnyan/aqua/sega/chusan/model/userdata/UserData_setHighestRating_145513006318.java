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

public class UserData_setHighestRating_145513006318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220600;
     Object term4220677;

    public UserData_setHighestRating_145513006318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220600 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220600, term4220600.getClass(), "id", 0L);
        setField(term4220600, term4220600.getClass(), "card", null);
        setField(term4220600, term4220600.getClass(), "userName", null);
        setIntField(term4220600, term4220600.getClass(), "level", 0);
        setIntField(term4220600, term4220600.getClass(), "reincarnationNum", 0);
        setField(term4220600, term4220600.getClass(), "exp", null);
        setLongField(term4220600, term4220600.getClass(), "point", 0L);
        setLongField(term4220600, term4220600.getClass(), "totalPoint", 0L);
        setIntField(term4220600, term4220600.getClass(), "playCount", 0);
        setIntField(term4220600, term4220600.getClass(), "multiPlayCount", 0);
        setIntField(term4220600, term4220600.getClass(), "playerRating", 0);
        setIntField(term4220600, term4220600.getClass(), "highestRating", 0);
        setIntField(term4220600, term4220600.getClass(), "nameplateId", 0);
        setIntField(term4220600, term4220600.getClass(), "frameId", 0);
        setIntField(term4220600, term4220600.getClass(), "characterId", 0);
        setIntField(term4220600, term4220600.getClass(), "trophyId", 0);
        setIntField(term4220600, term4220600.getClass(), "playedTutorialBit", 0);
        setIntField(term4220600, term4220600.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220600, term4220600.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220600, term4220600.getClass(), "totalMapNum", 0);
        setLongField(term4220600, term4220600.getClass(), "totalHiScore", 0L);
        setLongField(term4220600, term4220600.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220600, term4220600.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220600, term4220600.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220600, term4220600.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220600, term4220600.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220600, term4220600.getClass(), "eventWatchedDate", null);
        setIntField(term4220600, term4220600.getClass(), "friendCount", 0);
        setField(term4220600, term4220600.getClass(), "firstGameId", null);
        setField(term4220600, term4220600.getClass(), "firstRomVersion", null);
        setField(term4220600, term4220600.getClass(), "firstDataVersion", null);
        setField(term4220600, term4220600.getClass(), "firstPlayDate", null);
        setField(term4220600, term4220600.getClass(), "lastGameId", null);
        setField(term4220600, term4220600.getClass(), "lastRomVersion", null);
        setField(term4220600, term4220600.getClass(), "lastDataVersion", null);
        setField(term4220600, term4220600.getClass(), "lastLoginDate", null);
        setField(term4220600, term4220600.getClass(), "lastPlayDate", null);
        setIntField(term4220600, term4220600.getClass(), "lastPlaceId", 0);
        setField(term4220600, term4220600.getClass(), "lastPlaceName", null);
        setField(term4220600, term4220600.getClass(), "lastRegionId", null);
        setField(term4220600, term4220600.getClass(), "lastRegionName", null);
        setField(term4220600, term4220600.getClass(), "lastAllNetId", null);
        setField(term4220600, term4220600.getClass(), "lastClientId", null);
        setField(term4220600, term4220600.getClass(), "lastCountryCode", null);
        setField(term4220600, term4220600.getClass(), "userNameEx", null);
        setField(term4220600, term4220600.getClass(), "compatibleCmVersion", null);
        setIntField(term4220600, term4220600.getClass(), "medal", 0);
        setIntField(term4220600, term4220600.getClass(), "mapIconId", 0);
        setIntField(term4220600, term4220600.getClass(), "voiceId", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarWear", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarHead", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarFace", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarSkin", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarItem", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarFront", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarBack", 0);
        setIntField(term4220600, term4220600.getClass(), "classEmblemBase", 0);
        setIntField(term4220600, term4220600.getClass(), "classEmblemMedal", 0);
        setIntField(term4220600, term4220600.getClass(), "stockedGridCount", 0);
        setIntField(term4220600, term4220600.getClass(), "exMapLoopCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattleWinCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220600, term4220600.getClass(), "charaIllustId", 0);
        setIntField(term4220600, term4220600.getClass(), "skillId", 0);
        setIntField(term4220600, term4220600.getClass(), "overPowerPoint", 0);
        setIntField(term4220600, term4220600.getClass(), "overPowerRate", 0);
        setIntField(term4220600, term4220600.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220600, term4220600.getClass(), "avatarPoint", 0);
        setIntField(term4220600, term4220600.getClass(), "battleRankId", 0);
        setIntField(term4220600, term4220600.getClass(), "battleRankPoint", 0);
        setIntField(term4220600, term4220600.getClass(), "eliteRankPoint", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattle1stCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattle4thCount", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattleCorrection", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220600, term4220600.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220600, term4220600.getClass(), "battleRewardStatus", 0);
        setIntField(term4220600, term4220600.getClass(), "battleRewardIndex", 0);
        setIntField(term4220600, term4220600.getClass(), "battleRewardCount", 0);
        setIntField(term4220600, term4220600.getClass(), "ext1", 0);
        setIntField(term4220600, term4220600.getClass(), "ext2", 0);
        setIntField(term4220600, term4220600.getClass(), "ext3", 0);
        setIntField(term4220600, term4220600.getClass(), "ext4", 0);
        setIntField(term4220600, term4220600.getClass(), "ext5", 0);
        setIntField(term4220600, term4220600.getClass(), "ext6", 0);
        setIntField(term4220600, term4220600.getClass(), "ext7", 0);
        setIntField(term4220600, term4220600.getClass(), "ext8", 0);
        setIntField(term4220600, term4220600.getClass(), "ext9", 0);
        setIntField(term4220600, term4220600.getClass(), "ext10", 0);
        setField(term4220600, term4220600.getClass(), "extStr1", null);
        setField(term4220600, term4220600.getClass(), "extStr2", null);
        setLongField(term4220600, term4220600.getClass(), "extLong1", 0L);
        setLongField(term4220600, term4220600.getClass(), "extLong2", 0L);
        setField(term4220600, term4220600.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220600, term4220600.getClass(), "isNetBattleHost", false);
        setIntField(term4220600, term4220600.getClass(), "netBattleEndState", 0);
        term4220677 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4220677;
        callMethod(klass, "setHighestRating", argTypes, term4220600, args);
    }

};


