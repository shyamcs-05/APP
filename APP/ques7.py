% Facts: parking_slot(SlotID, VehicleType, Availability).
parking_slot(s1, car, available).
parking_slot(s2, bike, occupied).
parking_slot(s3, car, available).
parking_slot(s4, bike, available).
parking_slot(s5, car, occupied).

% Rule: identify an available slot for a specified vehicle type.
available_slot(VehicleType, SlotID) :-
parking_slot(SlotID, VehicleType, available).